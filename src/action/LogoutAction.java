package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;


public class LogoutAction extends ActionSupport
	implements ServletRequestAware
{
	
	private HttpServletRequest request;
	
	public void setServletRequest(
		HttpServletRequest request)
	{
		this.request = request;
	}
	public String execute()
		throws Exception
	{

		HttpSession session = request.getSession();
	
		session.invalidate();
		return SUCCESS;
	}
}