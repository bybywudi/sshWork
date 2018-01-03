package service.impl;

import dao.*;
import domain.*;
import vo.*;
import exception.*;
import service.*;

import java.io.File;
import java.text.*;
import java.util.*;



public class MgrManagerImpl
implements MgrManager
{
private ApplicationDao appDao;
private AttendDao attendDao;
private AttendTypeDao typeDao;
private CheckBackDao checkDao;
private EmployeeDao empDao;
private ManagerDao mgrDao;
private PaymentDao payDao;
private SetMgrDao smDao;
private ReportDao reportDao;
private UpFileDao upFileDao;
private ProjectMemberDao pmDao;

public void setPmDao(ProjectMemberDao pmDao) {
	this.pmDao = pmDao;
}

public void setAppDao(ApplicationDao appDao)
{
	this.appDao = appDao;
}

public void setAttendDao(AttendDao attendDao)
{
	this.attendDao = attendDao;
}

public void setTypeDao(AttendTypeDao typeDao)
{
	this.typeDao = typeDao;
}

public void setCheckDao(CheckBackDao checkDao)
{
	this.checkDao = checkDao;
}

public void setEmpDao(EmployeeDao empDao)
{
	this.empDao = empDao;
}

public void setMgrDao(ManagerDao mgrDao)
{
	this.mgrDao = mgrDao;
}

public void setPayDao(PaymentDao payDao)
{
	this.payDao = payDao;
}


public void setSmDao(SetMgrDao smDao) {
	this.smDao = smDao;
}

public void setReportDao(ReportDao reportDao) {
	this.reportDao = reportDao;
}

public void setUpFileDao(UpFileDao upFileDao) {
	this.upFileDao = upFileDao;
}

public Manager login(String mgrName) {
	return mgrDao.findByName(mgrName);
}


/**
 * 新增员工
 * @param emp 新增的员工
 * @param mgr 员工所属的经理
 */
public void addEmp(Employee emp , String mgr)throws HrException
{
	Manager m = mgrDao.findByName(mgr);
	if (m == null)
	{
		throw new HrException("您是经理吗？或你还未登录？");
	}
	emp.setManager(m);
	empDao.save(emp);
}

/**
 * 根据经理返回所有的部门上个月工资
 * @param mgr 新增的员工名
 * @return 部门上个月工资
 */
public List<SalaryBean> getSalaryByMgr(String mgr)throws HrException
{
	Manager m = mgrDao.findByName(mgr);
	if (m == null)
	{
		throw new HrException("您是经理吗？或你还未登录？");
	}
	//查询该经理对应的全部员工
	Set<Employee> emps = m.getEmployees();
	//部门依然没有员工
	if (emps == null || emps.size() < 1)
	{
		throw new HrException("您的部门没有员工");
	}
	Calendar c = Calendar.getInstance();
	c.add(Calendar.MONTH , -1);
	SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM");
	String payMonth = sdf.format(c.getTime());
	List<SalaryBean> result = new ArrayList<SalaryBean>();
	//遍历本部门每个员工
	for (Employee e : emps)
	{
		Payment p = payDao.findByMonthAndEmp(payMonth , e);
		if (p != null)
		{
			result.add(new SalaryBean(e.getName()
				, p.getAmount()));
		}
	}
	return result;
}

public List<EmpBean> getAllMgrs()
		throws HrException
	{
		List<Manager> mgrs = mgrDao.findAll(Manager.class);
		//封装VO集
		List<EmpBean> result = new ArrayList<EmpBean>();
		for (Employee e : mgrs)
		{
			result.add(new EmpBean(e.getName() ,
				e.getRealname() , e.getSalary()));
		}
		return result;
	}


/**
* 根据经理返回该部门的全部员工
* @param mgr 经理名
* @return 经理的全部下属
*/
public List<EmpBean> getEmpsByMgr(String mgr)
	throws HrException
{
	Manager m = mgrDao.findByName(mgr);
	if (m == null)
	{
		throw new HrException("您是经理吗？或你还未登录？");
	}
	//查询该经理对应的全部员工
	Set<Employee> emps = m.getEmployees();
	//部门依然没有员工
	if (emps == null || emps.size() < 1)
	{
		throw new HrException("您的部门没有员工");
	}
	//封装VO集
	List<EmpBean> result = new ArrayList<EmpBean>();
	for (Employee e : emps)
	{
		result.add(new EmpBean(e.getName() ,
			e.getRealname() , e.getSalary()));
	}
	return result;
}

/**
 * 根据经理返回该部门的没有批复的申请
 * @param mgr 经理名
 * @return 该部门的全部申请
 */
public List<AppBean> getAppsByMgr(String mgr)throws HrException
{
	Manager m = mgrDao.findByName(mgr);
	if (m == null)
	{
		throw new HrException("您是经理吗？或你还未登录？");
	}
	//查询该经理对应的全部员工
	Set<Employee> emps = m.getEmployees();
	//部门依然没有员工
	if (emps == null || emps.size() < 1)
	{
		throw new HrException("您的部门没有员工");
	}
	//封装VO集
	List<AppBean> result = new ArrayList<AppBean>();
	for (Employee e : emps)
	{
		//查看该员工的全部申请
		List<Application> apps = appDao.findByEmp(e);
		if (apps != null && apps.size() > 0)
		{
			for (Application app : apps)
			{
				//只选择还未处理的申请
				if (app.getResult() == false)
				{
					Attend attend = app.getAttend();
					result.add(new AppBean(app.getId() ,
						e.getName(), attend.getType().getName(),
						app.getType().getName(), app.getReason()));
				}
			}
		}
	}
	return result;
}

/**
 * 处理申请
 * @param appid 申请ID
 * @param mgrName 经理名字
 * @param result 是否通过
 */
public void check(int appid, String mgrName, boolean result)
{
	Application app = appDao.get(Application.class , appid);
	CheckBack check = new CheckBack();
	check.setApp(app);
	Manager manager = mgrDao.findByName(mgrName);
	if (manager == null)
	{
		throw new HrException("您是经理吗？或你还未登录？");
	}
	check.setManager(manager);
	//同意通过申请
	if (result)
	{
		//设置通过申请
		check.setResult(true);

		//修改申请为已经批复
		app.setResult(true);
		appDao.update(app);
		//为真时，还需要修改出勤的类型
		Attend attend = app.getAttend();
		attend.setType(app.getType());
		attendDao.update(attend);
	}
	else
	{
		//没有通过申请
		check.setResult(false);
		app.setResult(true);
		appDao.update(app);
	}
	//保存申请批复
	checkDao.save(check);
}

public void setMgr(String mgrName,int empId) {
	Manager m = mgrDao.findByName(mgrName);
	if (m == null)
	{
		throw new HrException("该老师不存在");
	}
	Employee emp = empDao.findById(empId);
	emp.setManager(m);
	empDao.update(emp);
}

public void agreeApp(String mgrName,int empId) {
	setMgr(mgrName,empId);
	
	smDao.setAllDeleteFlag(mgrName, empId);
}

public void disagreeApp(String mgrName,int empId) {
	SetMgrApp sma = smDao.findByMgrNameAndEmpId(mgrName, empId);
	sma.setResult(false);
	sma.setDeleteFlag(1);
	smDao.update(sma);
}

public List<SetMgrApp> listAllSetMgrApp(String mgrName){
	return smDao.findByMgr(mgrName);
}

//获得单个员工的所有报告
public List<Report> getAllEmpReportByPage(int mgrId,int empId,int pageNo,int pageSize){
	return reportDao.findByMgrIdAndEmpIdByPage(mgrId, empId, pageNo, pageSize);
}

public PageBean<Report> getAllEmpReportByPage(int mgrId,int empId,QuerryInfo qr){
	PageBean pb = new PageBean();
	pb.setList(reportDao.findByMgrIdAndEmpIdByPage(mgrId, empId, qr.getCurrentpage(), qr.getPagesize()));
	pb.setTotalrecord((int)reportDao.findCountByMgrId(mgrId));
	pb.setCurrentpage(qr.getCurrentpage());
	pb.setPagesize(qr.getPagesize());
	
	return pb;
}

public UpFile getFileByReportId(int reportId) {
	
	return upFileDao.findByReportId(reportId);
}

public List<Report> getAllReportByPage(int mgrId,int pageNo,int pageSize){
	return reportDao.findByMgrIdByPage(mgrId, pageNo, pageSize);
}

public List<Report> getAllReportByTimeByPage(int mgrId,String time,int pageNo,int pageSize){
	return reportDao.findByMgrIdAndTimeByPage(mgrId, time, pageNo, pageSize);
}

public ReportBean viewReport(int reportId) {
	Report report = reportDao.get(Report.class, reportId);
	UpFile upfile = upFileDao.findByReportId(reportId);
	report.setContent(report.getContent().replaceAll(" ","&nbsp;").replaceAll("\r","<br/>"));
	
	ReportBean reportBean = new ReportBean(report,upfile);
	
	return reportBean;
}

public UpFile findFile(int fileId) {
	return upFileDao.get(UpFile.class, fileId);

}

/**
 * 管理员添加论文文件
 */

public void addFile(UpFile file) {
	file.setFileType(3);
	upFileDao.save(file);
}

/**
 * 列出老师所在实验室的论文成果列表
 */

public PageBean<UpFile> listPaperFile(int mgrId,QuerryInfo qr) {
	PageBean pb = new PageBean();
	pb.setList(upFileDao.findPaperByMgrIdByPage(mgrId, qr.getCurrentpage(), qr.getPagesize()));
	pb.setTotalrecord((int)upFileDao.findPaperCountByMgrId(mgrId));
	pb.setCurrentpage(qr.getCurrentpage());
	pb.setPagesize(qr.getPagesize());
	
	return pb;
}

/**
 * 管理员添加项目成员照片
 */

public void addProjectMemberWithPic(UpFile file,ProjectMember pm) {
	pmDao.save(pm);
	file.setFileType(4);
	file.setCorrId(pm.getId());
	upFileDao.save(file);
}

public void addProjectMember(ProjectMember pm) {
	pmDao.save(pm);
}

/*public List<ProjectMemberBean> listProjectMember(int mgrId) {
	List pmbs = new ArrayList();
	String separator = System.getProperty("file.separator");
	String savePath;
	List<ProjectMember> pmlist = pmDao.findByMgrId(mgrId);
	for(ProjectMember pm : pmlist) {
		ProjectMemberBean pmb = new ProjectMemberBean();
		UpFile upfile = upFileDao.findByProjectMemberId(pm.getId());
		savePath = upfile.getSavePath();
		System.out.println(upfile.getSavePath());
		System.out.println(savePath);
		savePath = savePath.replaceAll("\\\\","/"); 
		System.out.println(savePath);
		savePath = savePath.substring(savePath.indexOf("/",savePath.indexOf("/")+1),savePath.length()-1);
		 
		System.out.println(savePath);
		
		savePath = savePath + "/" + upfile.getUuidName();
		upfile.setSavePath(savePath);
		pmb.setUpfile(upfile);
		pmb.setPm(pm);
		pmbs.add(pmb);
	}
	
	return pmbs;
}*/

public List<ProjectMemberBean> listProjectMember(int mgrId) {
	List pmbs = new ArrayList();
	String separator = System.getProperty("file.separator");
	String fsavePath;
	UpFile upfile;
	List<ProjectMember> pmlist = pmDao.findByMgrId(mgrId);
	for(ProjectMember pm : pmlist) {
		ProjectMemberBean pmb = new ProjectMemberBean();
		upfile = upFileDao.findByProjectMemberId(pm.getId());
		 
		
		fsavePath = upfile.getSavePath();
		fsavePath = fsavePath.replaceAll("\\\\","/"); 
		
		fsavePath = fsavePath.substring(fsavePath.indexOf("/",fsavePath.indexOf("/")+1),fsavePath.length());

		fsavePath = fsavePath + "/" + upfile.getUuidName();

		//upfile.setSavePath(savePath);这句话千万不能加，hibernate中的upfile在瞬态的时候使用set方法会改变数据库中的值
		//pmb.setUpfile(upfile); 
		//由于fsavePath一开始起名是savePath，在改变savePath的时候一直会出现hibernate向数据库保存该条记录的情况，改成不一样的名字就OK了
		pmb.setFsavePath(fsavePath);
		
		pmb.setPm(pm);
		pmbs.add(pmb);
	}
	
	return pmbs;
}
/**
 * 删除项目成员的数据库记录，删除相应的文件的数据库记录，并删除相应的文件
 */
public void deleteProjectMember(int pmId) {
	ProjectMember pm = pmDao.get(ProjectMember.class, pmId);
	UpFile upfile = upFileDao.findByProjectMemberId(pmId);
	String fsavePath = upfile.getSavePath() + System.getProperty("file.separator") + upfile.getUuidName();
	File file = new File(fsavePath);
	
	pmDao.delete(pm);
	upFileDao.delete(upfile);
     // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
     if (file.exists() && file.isFile()) {
         file.delete();
     }
            
}

/**
 * 删除论文成果的数据库记录，并删除相应的文件
 */
public void deletePaperFile(int fId) {
	UpFile upfile = upFileDao.get(UpFile.class, fId);
	String fsavePath = upfile.getSavePath() + System.getProperty("file.separator") + upfile.getUuidName();
	File file = new File(fsavePath);
	
	upFileDao.delete(upfile);
     // 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
     if (file.exists() && file.isFile()) {
         file.delete();
     }
            
}
}
