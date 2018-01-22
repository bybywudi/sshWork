package action;

import static service.EmpManager.LOGIN_EMP;
import static service.EmpManager.LOGIN_MGR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import com.opensymphony.xwork2.ActionContext;

import action.base.EmpBaseAction;
import action.base.MgrBaseAction;
import domain.Employee;
import domain.Manager;
import domain.ProjectMember;
import domain.Report;
import domain.UpFile;
import utils.WebUtils;

public class AddFileAction extends MgrBaseAction
{	
	
	private String pmName;
	
	private String pmIntroduction;
	
	private String description;
	
	private File upload;  

	private String uploadContentType;
	
	private String uploadFileName;

	private String savePath;
	
	private String lsavePath;
	
	private String url;
	
	private String urlName;

	private int mid;
	
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getUrlName() {
		return urlName;
	}

	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLsavePath() {
		return lsavePath;
	}

	public void setLsavePath(String lsavePath) {
		this.lsavePath = lsavePath;
	}

	public void setSavePath(String value)
	{
		this.savePath = value;
	}

	/*private String getSavePath() throws Exception
	{
		return ServletActionContext.getServletContext()
			.getRealPath(savePath);
	}*/
	
	private String getSavePath() throws Exception
	{
		return savePath;
		/*System.out.println(ServletActionContext.getServletContext()
		.getRealPath(savePath));
		return ServletActionContext.getServletContext()
		.getRealPath(savePath);*/
	}


	public void setUpload(File upload)
	{
		this.upload = upload;
	}
	public File getUpload()
	{
		return (this.upload);
	}


	public void setUploadContentType(String uploadContentType)
	{
		this.uploadContentType = uploadContentType;
	}
	public String getUploadContentType()
	{
		return (this.uploadContentType);
	}

	public void setUploadFileName(String uploadFileName)
	{
		this.uploadFileName = uploadFileName;
	}
	public String getUploadFileName()
	{
		return (this.uploadFileName);
	}
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPmName() {
		return pmName;
	}

	public void setPmName(String pmName) {
		this.pmName = pmName;
	}

	public String getPmIntroduction() {
		return pmIntroduction;
	}

	public void setPmIntroduction(String pmIntroduction) {
		this.pmIntroduction = pmIntroduction;
	}

	// 管理员添加论文成果
	public String execute()
		throws Exception
	{		
		if(System.getProperty("file.separator").equals("/")) {
			setSavePath(getLsavePath());
		}
			mgr.addFile(upLoadFile());
			addActionMessage("添加成功");
			return SUCCESS;
	}
	
	// 管理员添加专利成果
	public String addPatent()
		throws Exception
	{		
		if(System.getProperty("file.separator").equals("/")) {
			setSavePath(getLsavePath());
		}
			mgr.addPatentFile(upLoadFile());
			addActionMessage("添加成功");
			return SUCCESS;
	}
	
	// 添加会议文件
	public String addMeetingFile()
		throws Exception
	{		
		if(System.getProperty("file.separator").equals("/")) {
			setSavePath(getLsavePath());
		}
			mgr.addMeetingFile(upLoadFile());
			addActionMessage("汇报成功");
			return SUCCESS;
	}

	// 添加文件共享
	public String addSharedFile()
			throws Exception
	{
		if(System.getProperty("file.separator").equals("/")) {
			setSavePath(getLsavePath());
		}
		mgr.addSharedFile(upLoadFile());
		addActionMessage("添加成功");
		return SUCCESS;
	}

	public String addProjectMember()
			throws Exception
		{		
		
		if(System.getProperty("file.separator").equals("/")) {
			setSavePath(getLsavePath());
		}
		ActionContext ctx = ActionContext.getContext();
		Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			ProjectMember pm = new ProjectMember();
			pm.setName(pmName);
			pm.setIntroduction(pmIntroduction);
			pm.setMgrId(emp.getId());
				if(upload != null) {
					
					mgr.addProjectMemberWithPic(upLoadFile(), pm);
				}else {
					mgr.addProjectMember(pm);
				}
			addActionMessage("添加成功");
			return SUCCESS;
		}
	
	private UpFile upLoadFile() throws IOException {
		ActionContext ctx = ActionContext.getContext();
		String level = (String)ctx.getSession()
				.get(WebConstant.LEVEL);
		UpFile upfile = new UpFile();
		if(level != null && level.equals(WebConstant.EMP_LEVEL)){
			Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);
			upfile.setUserId(emp.getId());
		}else {
			Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			upfile.setUserId(emp.getId());
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		
		
		


			upfile.setFileName(uploadFileName);
			upfile.setUuidName(WebUtils.generateFilename(uploadFileName));
			upfile.setDescription(description);
			upfile.setSavePath(WebUtils.generateSavePath(savePath, uploadFileName));

			upfile.setUrl(url);
			upfile.setUrlName(urlName);
			if(Integer.toString(id) != null) {
				upfile.setCorrId(id);
			}
			//upfile.setFileType(3);
			upfile.setUpTime(df.format(System.currentTimeMillis()));
			
			FileOutputStream fos = new FileOutputStream(upfile.getSavePath()+ System.getProperty("file.separator") + upfile.getUuidName());
			FileInputStream fis = new FileInputStream(getUpload());
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0)
			{
				fos.write(buffer , 0 , len);
			}
			fos.close();
			
			return upfile;
	}
	
}
