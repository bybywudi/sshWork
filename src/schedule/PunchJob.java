package schedule;

import java.util.Date;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import service.EmpManager;


public class PunchJob extends QuartzJobBean
{
	
	private boolean isRunning = false;
	
	private EmpManager empMgr;
	public void setEmpMgr(EmpManager empMgr)
	{
		this.empMgr = empMgr;
	}
	
	public void executeInternal(JobExecutionContext ctx)
		throws JobExecutionException
	{
		if (!isRunning)
		{
			System.out.println("自动结算工资");
			isRunning = true;
		
			empMgr.autoPunch();
			isRunning = false;
		}
	}
}