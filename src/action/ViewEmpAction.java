package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import service.MgrManager;
import exception.HrException;
import action.base.MgrBaseAction;

import java.util.List;


public class ViewEmpAction extends MgrBaseAction
{

	private List emps;

	public void setEmps(List emps)
	{
		this.emps = emps;
	}
	public List getEmps()
	{
		return this.emps;
	}
	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();

		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		setEmps(mgr.getEmpsByMgr(mgrName));
		return SUCCESS;
	}
}