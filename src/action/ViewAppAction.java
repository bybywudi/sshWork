package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import service.MgrManager;
import exception.HrException;
import action.base.MgrBaseAction;

import java.util.List;


public class ViewAppAction extends MgrBaseAction
{
	private List apps;
	// apps��setter��getter����
	public void setApps(List apps)
	{
		this.apps = apps;
	}
	public List getApps()
	{
		return this.apps;
	}
	public String execute()
		throws Exception
	{
		// ����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		// ��ȡHttpSession�е�user����
		String mgrName = (String)ctx.getSession()
			.get(WebConstant.USER);
		// ��ȡ��Ҫ����ǰ�������ȫ������
		setApps(mgr.getAppsByMgr(mgrName));
		return SUCCESS;
	}
}