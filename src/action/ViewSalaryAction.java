package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import service.EmpManager;
import vo.PaymentBean;
import exception.HrException;
import action.base.EmpBaseAction;


import java.util.*;



public class ViewSalaryAction extends EmpBaseAction
{

	private List salarys;
	
	public void setSalarys(List salarys)
	{
		this.salarys = salarys;
	}
	public List getSalarys()
	{
		return this.salarys;
	}

	public String execute()
		throws Exception
	{
	
		ActionContext ctx = ActionContext.getContext();
	
		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		List<PaymentBean> salarys =  mgr.empSalary(user);
		setSalarys(salarys);
		return SUCCESS;
	}
}