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
import vo.PageBean;
import vo.QuerryInfo;
import domain.*;
import action.base.MgrBaseAction;

public class IndexAction extends MgrBaseAction
{	
	
	private int currentpage;
	private int pagesize;
	//由jsp页面封装的mgrId作为查询依据
	private int mgrId;
	//封装首页的论文成果
	private PageBean pbpaper;
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	public int getMgrId() {
		return mgrId;
	}

	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}

	public PageBean getPbpaper() {
		return pbpaper;
	}

	public void setPbpaper(PageBean pbpaper) {
		this.pbpaper = pbpaper;
	}
	//封装首页的项目成员
	/*private List pms;

	//封装首页的成果综述
	
	//封装首页的专利成果
	private PageBean pbpatent;
	

	public List getPms() {
		return pms;
	}

	public void setPms(List pms) {
		this.pms = pms;
	}
	
	
	

	public PageBean getPbpatent() {
		return pbpatent;
	}

	public void setPbpatent(PageBean pbpatent) {
		this.pbpatent = pbpatent;
	}*/
	
	private ArticleBean arBean;

	public String execute()
			throws Exception
		{

			ActionContext ctx = ActionContext.getContext();
			String level = (String)ctx.getSession()
					.get(WebConstant.LEVEL);
			
			currentpage = 1;
			pagesize = 4;
			QuerryInfo qr = new QuerryInfo();
			qr.setCurrentpage(currentpage);
			qr.setPagesize(pagesize);
			HttpServletRequest
			 request = ServletActionContext.getRequest();

			/*setPbpaper(mgr.listPaperFile(mgrId, qr));
			arBean = mgr.getAchievement(mgrId);*/
		


		if ( level != null && level.equals(WebConstant.MGR_LEVEL))
		{
			Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			if(emp != null) {
				setPbpaper(mgr.listPaperFile(emp.getId(), qr));
				arBean = mgr.getAchievement(emp.getId());
			}
		}else {
				setPbpaper(mgr.listPaperFile(mgrId, qr));
				arBean = mgr.getAchievement(mgrId);
			  }
			
			content = arBean.getaContent();
			request.setAttribute("content",
					content);
			
			 
			return SUCCESS;
		}
	
}

