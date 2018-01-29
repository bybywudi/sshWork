package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import vo.ArticleBean;
import vo.PageBean;
import vo.QuerryInfo;
import domain.*;
import action.base.MgrBaseAction;

public class RealListArticleAction extends MgrBaseAction
{	
	//由jsp页面封装的qr，包括当前第几页，每页显示多少条，数组起始数字为多少
	private PageBean pb;
	private int currentpage;
	private int pagesize;

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


	public PageBean getPb() {
		return pb;
	}


	public void setPb(PageBean pb) {
		this.pb = pb;
	}


	public String listMessage()
			throws Exception
		{	
			QuerryInfo qr = new QuerryInfo();
			
			
			ActionContext ctx = ActionContext.getContext();
	
			qr.setCurrentpage(getCurrentpage());
	
			qr.setPagesize(pagesize);

			Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			
			/*if(emp != null) {
				setAlist(mgr.listMessage(emp.getId()));
			}else {
				return ERROR;
			}*/
			setPb(mgr.listMessage(emp.getId(), qr));
			return SUCCESS;
		}
}