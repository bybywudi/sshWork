package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.json.annotations.JSON;

import exception.HrException;
import domain.*;
import action.base.MgrBaseAction;

public class JsonAction extends MgrBaseAction
{
 
	private String title;
	private String mcontent;
	private int mgrId;
 

	public void setTitle(String title) {
		this.title = title;
	}


	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}

	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	
	private String response;
	public String addMessage()
			throws Exception
		{	
			ActionContext ctx = ActionContext.getContext();
			
			if(mcontent.trim().equals("") || mcontent==null || mcontent.length()<=8) {
				response = "留言必须在8个字符以上";
				return Action.SUCCESS;
			}
			
			
			String flag = (String) ctx.getSession().get("flag");
			if (flag == null)
			{
				ctx.getSession().put("flag", "1");
				ctx.getSession().put("num", 1);

			}
			int num = (int) ctx.getSession().get("num");
			if(num>=3) {
				response = "请不要频繁留言";
				return Action.SUCCESS;
			}
			

			ctx.getSession().put("num", num + 1);

			

			Article a = new Article();
			a.setContent(mcontent);
			a.setArticleType(1);
			a.setUserId(1);
			mgr.addArticl(a);
			
			response = "您已留言成功，请耐心等待回复";
			return Action.SUCCESS;
		}
	@JSON(name="response")
	public String getResponse() {
		return response;
	}
	
	
}