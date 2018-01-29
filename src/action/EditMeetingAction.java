package action;

import action.base.MgrBaseAction;
import com.opensymphony.xwork2.ActionContext;
import domain.Manager;
import domain.Meeting;
import domain.UpFile;

public class EditMeetingAction extends MgrBaseAction
{
 
	private int id;
	private Meeting meeting;
	private String headline;
	private String content;
	private String studentName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Meeting getMeeting() {
		return meeting;
	}

	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String toeditMeeting()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();

		Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
		if(emp != null) {
			setMeeting(mgr.getMeetingById(id));
			return SUCCESS;
		}else {
			return ERROR;
		}

	}
	

	public String editMeeting()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();

		Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
		
		if(emp != null) {
			Meeting meeting = mgr.getMeetingById(id);
			meeting.setStudentName(studentName);
			meeting.setHeadline(headline);
			meeting.setContent(content);
			mgr.updateMeeting(meeting);
			addActionMessage("修改成功");
			return SUCCESS;
		}else {
			return ERROR;
		}

	}
}