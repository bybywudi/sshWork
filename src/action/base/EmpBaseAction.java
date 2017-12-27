package action.base;

import com.opensymphony.xwork2.ActionSupport;

import service.EmpManager;


public class EmpBaseAction extends ActionSupport
{
	
	protected EmpManager mgr;
	
	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}
}