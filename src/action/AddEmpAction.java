package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import domain.*;
import action.base.MgrBaseAction;

public class AddEmpAction extends MgrBaseAction
{

	private Employee emp;


	public void setEmp(Employee emp)
	{
		this.emp = emp;
	}
	public Employee getEmp()
	{
		return this.emp;
	}

	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();

		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);

		mgr.addEmp(emp , mgrName);
		addActionMessage("注册成功");
		return SUCCESS;
	}
}