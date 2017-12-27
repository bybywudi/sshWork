package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import domain.*;
import action.base.MgrBaseAction;

public class ListSetMgrAppAction extends MgrBaseAction
{	
	private List<SetMgrApp> setMgrApps;
	

	public List<SetMgrApp> getSetMgrApps() {
		return setMgrApps;
	}


	public void setSetMgrApps(List<SetMgrApp> setMgrApps) {
		this.setMgrApps = setMgrApps;
	}
  
	public String execute()
			throws Exception
		{

			ActionContext ctx = ActionContext.getContext();

			String mgrName = (String)ctx.getSession()
				.get(WebConstant.USER);
			
			setSetMgrApps(mgr.listAllSetMgrApp(mgrName));
			return SUCCESS;
		}
	
}