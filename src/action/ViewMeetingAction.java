package action;

import java.util.List;

import action.base.MgrBaseAction;
import vo.ListMeetingBean;
import vo.ReportBean;

public class ViewMeetingAction extends MgrBaseAction
{
	private int id;
	private ListMeetingBean lmb;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ListMeetingBean getLmb() {
		return lmb;
	}

	public void setLmb(ListMeetingBean lmb) {
		this.lmb = lmb;
	}

	public String empViewMeeting()
		throws Exception
	{
		setLmb(mgr.viewMeeting(id));
		
		return SUCCESS;
	}
	
	public String mgrViewMeeting()
			throws Exception
		{
			
			setLmb(mgr.viewMeeting(id));
			return SUCCESS;
		}
}



