package action;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import domain.*;
import action.base.EmpBaseAction;

public class SendSetMgrAppAction extends EmpBaseAction
{	
	//此处不需要传入mgr的信息，因为执行此方法的时候Mgr必然是在session中的
	private int empId;
	private String comment;
	private String mgrName;
	private int empRealName;
	private int deleteFlag;
	private Date appTime;
	private boolean result;
	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}
	

	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getMgrName() {
		return mgrName;
	}


	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}


	public int getEmpRealName() {
		return empRealName;
	}


	public void setEmpRealName(int empRealName) {
		this.empRealName = empRealName;
	}


	public int getDeleteFlag() {
		return deleteFlag;
	}


	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}


	public Date getAppTime() {
		return appTime;
	}


	public void setAppTime(Date appTime) {
		this.appTime = appTime;
	}


	public boolean isResult() {
		return result;
	}


	public void setResult(boolean result) {
		this.result = result;
	}


	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();

		Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);
		SetMgrApp sma = new SetMgrApp();
		sma.setEmpId(emp.getId());
		sma.setComment(comment);
		sma.setEmpRealName(emp.getRealname());
		sma.setMgrName(mgrName);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		sma.setAppTime(df.format(System.currentTimeMillis()));
		sma.setDeleteFlag(0);
		sma.setResult(true);
		
		mgr.sendSetMgrApp(sma);
		addActionMessage("发送申请成功");
		return SUCCESS;
	}
	
}
	