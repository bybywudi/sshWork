package action;


import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import service.EmpManager;
import domain.*;
import exception.HrException;
import action.base.EmpBaseAction;
import static service.EmpManager.*;


public class LoginAction extends EmpBaseAction
{
	// 定义一个常量作为员工登录成功的Result名
	private final String EMP_RESULT = "emp";
	// 定义一个常量作为经理登录成功的Result名
	private final String MGR_RESULT = "mgr";
	// 封装请求参数
	private Manager manager;
	// manager的setter和getter方法
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return this.manager;
	}

	// 处理用户请求
	public String execute()
		throws Exception
	{
		// 创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();


			// 调用业务逻辑方法来处理登录请求
			//由import static service.EmpManager.*;引入mgr
			int result = mgr.validLogin(getManager());
			
			// 登录结果为普通员工
			if (result == LOGIN_EMP)
			{
				Employee user = mgr.loginEmp(manager.getName());
				ctx.getSession().put(WebConstant.USER
					, manager.getName());
				ctx.getSession().put(WebConstant.USERBEAN
						, user);
				ctx.getSession().put(WebConstant.LEVEL
						, WebConstant.EMP_LEVEL);
				ctx.getSession().put(WebConstant.USERID
						, user.getId());
				addActionMessage("您已经成功登录系统"); 
				return EMP_RESULT;
			}
			// 登录结果为经理
			else if (result == LOGIN_MGR)
			{
				Manager user = mgr.loginMgr(manager.getName());
				ctx.getSession().put(WebConstant.USER
					, manager.getName());
				ctx.getSession().put(WebConstant.USERBEAN
						, user);
				ctx.getSession().put(WebConstant.LEVEL
						, WebConstant.MGR_LEVEL);
				ctx.getSession().put(WebConstant.USERID
						, user.getId());
				addActionMessage("您已经成功登录系统");
				return MGR_RESULT;
			}
			// 用户名和密码不匹配
			else
			{
				addActionMessage("用户名/密码不匹配");
				return ERROR;
			}

	}
}
/*
public class LoginAction extends EmpBaseAction
{
	// 定义一个常量作为员工登录成功的Result名
	private final String EMP_RESULT = "emp";
	// 定义一个常量作为经理登录成功的Result名
	private final String MGR_RESULT = "mgr";
	// 封装请求参数
	private Manager manager;
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
			// 调用业务逻辑方法来处理登录请求
			//由import static service.EmpManager.*;引入mgr
			int result = mgr.validLogin(getManager());
			
			// 登录结果为普通员工
			if (result == LOGIN_EMP)
			{
				Employee user = mgr.loginEmp(manager.getName());
				ctx.getSession().put(WebConstant.USER
					, manager.getName());
				ctx.getSession().put(WebConstant.USERBEAN
						, user);
				ctx.getSession().put(WebConstant.LEVEL
						, WebConstant.EMP_LEVEL);
				addActionMessage("您已经成功登录系统"); 
				return EMP_RESULT;
			}
			// 登录结果为经理
			else if (result == LOGIN_MGR)
			{
				Manager user = mgr.loginMgr(manager.getName());
				ctx.getSession().put(WebConstant.USER
					, manager.getName());
				ctx.getSession().put(WebConstant.USERBEAN
						, user);
				ctx.getSession().put(WebConstant.LEVEL
						, WebConstant.MGR_LEVEL);
				addActionMessage("您已经成功登录系统");
				return MGR_RESULT;
			}
			// 用户名和密码不匹配
			else
			{
				addActionMessage("用户名/密码不匹配");
				return ERROR;
			}
		}
		// 验证码不匹配
		addActionMessage("验证码不匹配,请重新输入");
		return ERROR;
	}
}*/