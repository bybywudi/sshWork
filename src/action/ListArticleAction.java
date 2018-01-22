package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import vo.ArticleBean;
import domain.*;
import action.base.MgrBaseAction;

public class ListArticleAction extends MgrBaseAction
{


	private int mgrId;
	private ArticleBean articleBean;
	private List alist;





	public void setAlist(List alist) {
		this.alist = alist;
	}

	public int getMgrId() {
		return mgrId;
	}

	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}



	public ArticleBean getArticleBean() {
		return articleBean;
	}

	public void setArticleBean(ArticleBean articleBean) {
		this.articleBean = articleBean;
	}

	public String listAchievement()
		throws Exception
	{
		
		ArticleBean arBean;
		ActionContext ctx = ActionContext.getContext();
		String level = (String)ctx.getSession()
				.get(WebConstant.LEVEL);
		
		
		if ( level != null && level.equals(WebConstant.MGR_LEVEL))
		{
			Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			if(emp != null) {
				arBean = mgr.getAchievement(emp.getId());
				setArticleBean(arBean);
			}
		}else {
				arBean = mgr.getAchievement(mgrId);
				setArticleBean(arBean);
			  }
		/*Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
		
		if(emp != null) {
			arBean = mgr.getAchievement(emp.getId());
		}else {
			arBean = mgr.getAchievement(mgrId);
		}*/
		

		
		HttpServletRequest
		 request = ServletActionContext.getRequest();

		request.setAttribute("articleBean",
				articleBean);

		
		return SUCCESS;
	}
	
	/*public String listMessage()
			throws Exception
		{
			
			ArticleBean arBean;
			ActionContext ctx = ActionContext.getContext();

			Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			
			if(emp != null) {
				setAlist(mgr.listMessage(emp.getId()));
			}else {
				return ERROR;
			}
			setAlist(mgr.listMessage(emp.getId()));
			System.out.println(alist.size());
			return SUCCESS;
		}*/
}