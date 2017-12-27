package action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import domain.*;
import action.base.MgrBaseAction;

public class SetMgrAction extends MgrBaseAction
{	
	//此处不需要传入mgr的信息，因为执行此方法的时候Mgr必然是在session中的
	private String empId;
	private String method;

	public String getEmpId() {
		return empId;
	}


	public void setEmpId(String empId) {
		this.empId = empId;
	}


	public String getMethod() {
		return method;
	}


	public void setMethod(String method) {
		this.method = method;
	}

	
	public String execute()
			throws Exception
		{

			ActionContext ctx = ActionContext.getContext();

			String mgrName = (String)ctx.getSession()
				.get(WebConstant.USER);
			int id = Integer.parseInt(empId);

			if(method.equals("agree")) {
				mgr.agreeApp(mgrName, id);
				addActionMessage("接受申请成功");
			}
			if(method.equals("disagree")) {
				mgr.disagreeApp(mgrName, id);
				addActionMessage("已拒绝申请");
			}
			return SUCCESS;
		}
	
	
}