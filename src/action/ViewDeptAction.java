package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import service.MgrManager;
import exception.HrException;
import action.base.MgrBaseAction;
import vo.*;

import java.util.List;



public class ViewDeptAction extends MgrBaseAction
{
	
	private List sals;
	
	public void setSals(List sals)
	{
		this.sals = sals;
	}
	public List getSals()
	{
		return this.sals;
	}

	public String execute()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		
		List<SalaryBean> result = mgr.getSalaryByMgr(mgrName);
		setSals(result);
		return SUCCESS;
	}
}