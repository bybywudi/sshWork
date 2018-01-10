package action;

import static service.EmpManager.LOGIN_EMP;
import static service.EmpManager.LOGIN_MGR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;

import com.opensymphony.xwork2.ActionContext;

import action.base.EmpBaseAction;
import domain.Employee;
import domain.Manager;
import domain.Report;
import domain.UpFile;
import utils.WebUtils;

public class SendReportAction extends EmpBaseAction
{	
	private Report report;
	
	private String description;
	
	private File upload;  

	private String uploadContentType;
	
	private String uploadFileName;

	private String savePath;
	
	private String lsavePath;
	
	
	
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

	
	public Report getReport() {
		return report;
	}

	public void setReport(Report report) {
		this.report = report;
	}

	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	// 处理用户请求 
	public String execute()
		throws Exception
	{
		if(System.getProperty("file.separator").equals("/")) {
			setSavePath(getLsavePath());
		}
		
		ActionContext ctx = ActionContext.getContext();
		Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		
		
		report.setEmpId(emp.getId());
		report.setMgrId(emp.getManager().getId());
		report.setReportTime(df.format(System.currentTimeMillis()));
		
		if(upload != null) {
			UpFile upfile = new UpFile();
			upfile.setFileName(uploadFileName);
			upfile.setUuidName(WebUtils.generateFilename(uploadFileName));
			upfile.setDescription(description);
			upfile.setSavePath(WebUtils.generateSavePath(savePath, uploadFileName));
			upfile.setUserId(emp.getId());
			upfile.setFileType(0);
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
			
			mgr.sendReport(report, upfile);
			addActionMessage("报告发送成功");
			return SUCCESS;
		}
		
		mgr.sendReport(report);
		addActionMessage("报告发送成功");
		return SUCCESS;
	}

	
}
