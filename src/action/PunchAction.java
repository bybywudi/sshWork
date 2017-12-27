package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import service.MgrManager;
import exception.HrException;
import action.base.EmpBaseAction;
import action.base.MgrBaseAction;

import java.util.*;

import java.text.SimpleDateFormat;


public class PunchAction extends EmpBaseAction
{

	private int punchIsValid;

	public void setPunchIsValid(int punchIsValid)
	{
		this.punchIsValid = punchIsValid;
	}
	public int getPunchIsValid()
	{
		return this.punchIsValid;
	}
	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();

		String user = (String)ctx.getSession()
			.get(WebConstant.USER);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String dutyDay = sdf.format(new Date());
		
		int result = mgr.validPunch(user , dutyDay);
		setPunchIsValid(result);
		return SUCCESS;
	}
}