package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import service.EmpManager;
import exception.HrException;
import action.base.EmpBaseAction;
import vo.*;

import java.util.*;
import java.text.SimpleDateFormat;


public class ProcessAppAction extends EmpBaseAction
{

	private int attId;

	private int typeId;

	private String reason;

	public void setAttId(int attId)
	{
		this.attId = attId;
	}
	public int getAttId()
	{
		return this.attId;
	}

	public void setTypeId(int typeId)
	{
		this.typeId = typeId;
	}
	public int getTypeId()
	{
		return this.typeId;
	}


	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public String getReason()
	{
		return this.reason;
	}


	public String execute()
		throws Exception
	{

		boolean result = mgr.addApplication(attId , typeId , reason);

		if(result)
		{
			addActionMessage("您已经申请成功，等待经理审阅");
		}
		else
		{
			addActionMessage("申请失败，请注意不要重复申请");
		}
		return SUCCESS;
	}
}