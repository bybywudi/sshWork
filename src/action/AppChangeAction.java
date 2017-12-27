package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import action.base.EmpBaseAction;
import vo.*;

import java.util.*;
import java.text.SimpleDateFormat;


public class AppChangeAction extends EmpBaseAction
{
	
	private List types;

	public void setTypes(List types)
	{
		this.types = types;
	}
	public List getTypes()
	{
		return this.types;
	}

	public String execute()
		throws Exception
	{
		setTypes(mgr.getAllType());
		return SUCCESS;
	}
}