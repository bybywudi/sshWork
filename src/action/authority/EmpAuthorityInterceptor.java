package action.authority;

import com.opensymphony.xwork2.*;

import com.opensymphony.xwork2.interceptor.*;

import action.WebConstant;


public class EmpAuthorityInterceptor extends AbstractInterceptor
{
	public String intercept(ActionInvocation invocation)
		throws Exception
	{
	
		ActionContext ctx = ActionContext.getContext();

		String level = (String)ctx.getSession()
			.get(WebConstant.LEVEL);

		if (level != null && (level.equals(WebConstant.EMP_LEVEL)
			|| level.equals(WebConstant.MGR_LEVEL)))
		{
			return invocation.invoke();
		}
		return Action.LOGIN;
	}
}