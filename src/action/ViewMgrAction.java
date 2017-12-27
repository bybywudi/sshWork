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


public class ViewMgrAction extends MgrBaseAction
{

	private List mgrs;

	public void setMgrs(List mgrs)
	{
		this.mgrs = mgrs;
	}
	public List getMgrs()
	{
		return this.mgrs;
	}
	public String execute()
		throws Exception
	{

		setMgrs(mgr.getAllMgrs());
		return SUCCESS;
	}
}
