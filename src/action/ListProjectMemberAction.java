package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import vo.PageBean;
import vo.QuerryInfo;
import domain.*;
import action.base.MgrBaseAction;

public class ListProjectMemberAction extends MgrBaseAction
{	
	//由jsp页面封装的qr，包括当前第几页，每页显示多少条，数组起始数字为多少
	
	private int mgrId;
	//action封装交给jsp的信息，包括搜索到的report列表，pagebean中包含分页信息
	private List pms;
	
	public int getMgrId() {
		return mgrId;
	}

	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}

	public List getPms() {
		return pms;
	}

	public void setPms(List pms) {
		this.pms = pms;
	}

	public String execute()
			throws Exception
		{

			ActionContext ctx = ActionContext.getContext();
			String level = (String)ctx.getSession()
					.get(WebConstant.LEVEL);
			
			if ( level != null && level.equals(WebConstant.MGR_LEVEL))
			{
				Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
				if(emp != null) {
					setPms(mgr.listProjectMember(emp.getId()));
				}
			}else {
					setPms(mgr.listProjectMember(mgrId));
				  }
			
			/*Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			
			if(emp != null) {
				setPms(mgr.listProjectMember(emp.getId()));
			}else {
				setPms(mgr.listProjectMember(mgrId));
			}*/
			
			
			
			
			return SUCCESS;
		}
	
}
