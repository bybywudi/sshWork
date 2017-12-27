package schedule;

import java.util.Date;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import service.EmpManager;


public class PayJob extends QuartzJobBean
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
			System.out.println("自动打卡");
			isRunning = true;
			
			empMgr.autoPay();
			isRunning = false;
		}
	}
}