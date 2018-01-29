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

public class DeleteAction extends MgrBaseAction
{	
	//由jsp页面封装的qr，包括当前第几页，每页显示多少条，数组起始数字为多少
	
	private int id;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String deleteProjectMember()
			throws Exception
		{

			ActionContext ctx = ActionContext.getContext();

			Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			
			if(emp != null) {
				mgr.deleteProjectMember(id);
				addActionMessage("删除成功");
			}
			

			return SUCCESS;
		}
	
	public String deletePaperFile()
			throws Exception
		{

			ActionContext ctx = ActionContext.getContext();

			Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			
			if(emp != null) {
				mgr.deletePaperFile(id);
				addActionMessage("删除成功");
			}
			

			return SUCCESS;
		}

	public String empdelete()
			throws Exception
	{

		ActionContext ctx = ActionContext.getContext();

		Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);

		if(emp != null) {
			mgr.deletePaperFile(id);
			addActionMessage("删除成功");
		}


		return SUCCESS;
	}
	
}

