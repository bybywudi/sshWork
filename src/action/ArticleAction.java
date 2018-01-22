package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import domain.*;
import action.base.MgrBaseAction;

public class ArticleAction extends MgrBaseAction
{
 
	private String title;
	private String content;
	private int mgrId;
 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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

	public String editAchievement()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();

		Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
		
		if(emp != null) {
			mgr.editAchievement(emp.getId(), title, content);
		}else {
			mgr.editAchievement(mgrId, title, content);
		}

		addActionMessage("修改成功");
		return SUCCESS;
	}
	
	public String addMessage()
			throws Exception
		{
			Article a = new Article();
			a.setContent(content);
			a.setArticleType(1);
			
			mgr.addArticl(a);
			addActionMessage("您以留言成功，请耐心等待回复");
			return SUCCESS;
		}
}