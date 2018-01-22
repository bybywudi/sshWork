package service;


import java.util.*;
import vo.*;
import domain.*;
import exception.HrException;

public interface MgrManager
{
	/**
	 * 新增员工
	 * @param emp 新增的员工
	 * @param mgr 员工所属的经理
	 */
	void addEmp(Employee emp , String mgr)
		throws HrException;


	/**
	 * 根据经理返回所有的部门上个月工资
	 * @param mgr 新增的员工名
	 * @return 部门上个月工资
	 */
	List<SalaryBean> getSalaryByMgr(String mgr);

	/**
	 * 根据经理返回该部门的全部员工
	 * @param mgr 经理名
	 * @return 经理的全部下属
	 */
	List<EmpBean> getEmpsByMgr(String mgr);

	/**
	 * 根据经理返回该部门的没有批复的申请
	 * @param mgr 经理名
	 * @return 该部门的全部申请
	 */
	List<AppBean> getAppsByMgr(String mgr);

	/**
	 * 处理申请
	 * @param appid 申请ID
	 * @param mgrName 经理名字
	 * @param result 是否通过
	 */
	void check(int appid, String mgrName, boolean result);
	void setMgr(String mgrName,int empId);
	void agreeApp(String mgrName,int empId);
	void disagreeApp(String mgrName,int empId);
	Manager login(String mgrName);
	List<SetMgrApp> listAllSetMgrApp(String mgrName);
	List<EmpBean> getAllMgrs();
	List<Report> getAllEmpReportByPage(int mgrId,int empId,int pageNo,int pageSize);
	UpFile getFileByReportId(int reportId);
	List<Report> getAllReportByPage(int mgrId,int pageNo,int pageSize);
	List<Report> getAllReportByTimeByPage(int mgrId,String time,int pageNo,int pageSize);
	PageBean<Report> getAllEmpReportByPage(int mgrId,int empId,QuerryInfo qr);
	ReportBean viewReport(int reportId);
	UpFile findFile(int fileId) ;
	void addFile(UpFile file);
	PageBean<UpFile> listPaperFile(int mgrId,QuerryInfo qr);
	void addProjectMemberWithPic(UpFile file,ProjectMember pm);
	void addProjectMember(ProjectMember pm);
	List<ProjectMemberBean> listProjectMember(int mgrId) ;
	void deleteProjectMember(int pmId) ;
	void deletePaperFile(int fId);
	void editAchievement(int mgrId,String title,String content);
	ArticleBean getAchievement(int mgrId);
	void addPatentFile(UpFile file);
	PageBean<UpFile> listPatentFile(int mgrId,QuerryInfo qr);
	void updateFile(UpFile file);
	UpFile getFile(int id);
	void addArticl(Article a);
	PageBean<Article> listMessage(int mgrId,QuerryInfo qr);
	PageBean<Report> getAllEmpReportByMgrIdByPage(int mgrId,QuerryInfo qr);
	public void createMeeting(Meeting m);
	public PageBean<Meeting> getAllMeetingBeforeEndTime(int mgrId , QuerryInfo qr);
	public PageBean<Meeting> getAllMeeting(int mgrId , QuerryInfo qr);
	ListMeetingBean viewMeeting(int mId) ;
	void addMeetingFile(UpFile file) ;
	PageBean<UpFileBean> listSharedFile(QuerryInfo qr);
	void addSharedFile(UpFile file);
	PageBean<UpFileBean> listUserFile(int userId,QuerryInfo qr);

}