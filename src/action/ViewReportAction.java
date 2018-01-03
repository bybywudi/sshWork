package action;

import java.util.List;

import action.base.MgrBaseAction;
import vo.ReportBean;

public class ViewReportAction extends MgrBaseAction
{
	private int id;
	private ReportBean reportBean;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public ReportBean getReportBean() {
		return reportBean;
	}
  

	public void setReportBean(ReportBean reportBean) {
		this.reportBean = reportBean;
	}


	public String empViewReport()
		throws Exception
	{
		
		setReportBean(mgr.viewReport(id));
		return SUCCESS;
	}
	
	public String mgrViewReport()
			throws Exception
		{
			
			setReportBean(mgr.viewReport(id));
			return SUCCESS;
		}
}



