package action.authority;

import action.WebConstant;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import domain.Employee;
import domain.Manager;


public class LoginInterceptor extends AbstractInterceptor
{
	public String intercept(ActionInvocation invocation)
		throws Exception
	{
	
		ActionContext ctx = ActionContext.getContext();

		String level = (String)ctx.getSession()
			.get(WebConstant.LEVEL);
		if(level.equals(WebConstant.MGR_LEVEL)){
			Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
			if(emp.getId() == 1){
				return invocation.invoke();
			}else{
				return Action.LOGIN;
			}
		}

		if(level.equals(WebConstant.EMP_LEVEL)){
			Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);
			if(emp.getManager() == null){
				return Action.LOGIN;
			}else{
				return invocation.invoke();
			}
		}

		return Action.LOGIN;
	}
}