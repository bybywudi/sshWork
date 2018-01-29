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

public class ListMeetingAction extends MgrBaseAction
{	
	//由jsp页面封装的qr，包括当前第几页，每页显示多少条，数组起始数字为多少
	
	private int mgrId;
	private int currentpage;
	private int pagesize;
	//action封装交给jsp的信息，包括搜索到的report列表，pagebean中包含分页信息
	private PageBean pb;
	/*private List list;
	private int pz;*/

	public PageBean getPb() {
		return pb;
	}


/*	public void setPz(int i) {
		this.pz = i;
	}


	public void setList(List list) {
		this.list = list;
	}*/


	public void setPb(PageBean pb) {
		this.pb = pb;
	}


	public int getMgrId() {
		return mgrId;
	}


	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}


	public int getCurrentpage() {
		return currentpage;
	}


	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}


	public int getPagesize() {
		return pagesize;
	}


	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	
	public String listMeetingByMgr()
			throws Exception
		{
			QuerryInfo qr = new QuerryInfo();
		
			
			ActionContext ctx = ActionContext.getContext();

			qr.setCurrentpage(getCurrentpage());

			qr.setPagesize(pagesize);
			
			
			Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);
			
			String level = (String)ctx.getSession()
					.get(WebConstant.LEVEL);

				if ( level != null && level.equals(WebConstant.MGR_LEVEL))
				{
					setPb(mgr.getAllMeeting(emp.getId(), qr));
				}
				if ( level != null && level.equals(WebConstant.EMP_LEVEL))
				{
					setPb(mgr.getAllMeeting(emp.getManager().getId(), qr));
				}
				
			
			/*setList(pb.getList());
			setPz(pb.getPagesize());*/
			return SUCCESS;
		}
	
	public String listMeetingByMgrBeforeEndTime()
			throws Exception
		{
			QuerryInfo qr = new QuerryInfo();
		
			
			ActionContext ctx = ActionContext.getContext();

			qr.setCurrentpage(getCurrentpage());

			qr.setPagesize(pagesize);
		
			
			Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);
			
			String level = (String)ctx.getSession()
					.get(WebConstant.LEVEL);

				if ( level != null && level.equals(WebConstant.MGR_LEVEL))
				{
					setPb(mgr.getAllMeetingBeforeEndTime(emp.getId(), qr));
				}
				if ( level != null && level.equals(WebConstant.EMP_LEVEL))
				{
					setPb(mgr.getAllMeetingBeforeEndTime(emp.getManager().getId(), qr));
				}
				
			return SUCCESS;
		}
	
}