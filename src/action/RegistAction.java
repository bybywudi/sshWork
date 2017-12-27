package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import service.EmpManager;
import domain.*;
import exception.HrException;
import action.base.EmpBaseAction;
import static service.EmpManager.*;


public class RegistAction extends EmpBaseAction
{
	// 定义一个常量作为员工登录成功的Result名
	private final String EMP_RESULT = "emp";
	// 定义一个常量作为经理登录成功的Result名
	private final String MGR_RESULT = "mgr";
	// 封装请求参数
	private Manager manager;
	private String role;

 
	// 登录的验证码
	private String vercode;
	// manager的setter和getter方法
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return this.manager;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	// vercode的setter和getter方法
	public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	public String getVercode()
	{
		return this.vercode;
	}

	// 处理用户请求
	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		// 获取HttpSession中的rand属性
		String ver2 = (String)ctx.getSession().get("rand");

		if (vercode.equalsIgnoreCase(ver2))
		{
			if(role.equals("teacher")) {
				boolean result = mgr.registMgr(manager);
				
				if(result == true) {
					addActionMessage("老师注册成功！请您登录");
					return SUCCESS;
				}else {
					addActionMessage("该用户已存在！");
					return ERROR;
				}
			}
			if(role.equals("student")) {
				boolean result = mgr.registEmp(manager);
				
				if(result == true) {
					addActionMessage("学生注册成功！请您登录");
					return SUCCESS;
				}else {
					addActionMessage("该用户已存在！");
					return ERROR;
				}
			}
			
		}
		// 验证码不匹配
		addActionMessage("验证码不匹配,请重新输入");
		return ERROR;
	}
}