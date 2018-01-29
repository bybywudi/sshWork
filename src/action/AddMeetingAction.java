package action;

import static service.EmpManager.LOGIN_EMP;
import static service.EmpManager.LOGIN_MGR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;

import com.opensymphony.xwork2.ActionContext;

import action.base.EmpBaseAction;
import action.base.MgrBaseAction;
import domain.Employee;
import domain.Manager;
import domain.Meeting;
import domain.ProjectMember;
import domain.Report;
import domain.UpFile;
import utils.WebUtils;

public class AddMeetingAction extends MgrBaseAction
{	
	
	private String headline;
	private String content;
	private String studentName;
	
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


	// 管理员添加会议
	public String addMeeting()
		throws Exception
	{		
		ActionContext ctx = ActionContext.getContext();

		Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
		
		Meeting m = new Meeting();
		if(emp != null) {
			m.setMgrId(emp.getId());
		}else{
			m.setMgrId(1);
		}
		

		m.setHeadline(headline);
		m.setContent(content);
		m.setStudentName(studentName);
		m.setMeetingStartTime(new Date());
		
		Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(new Date());
        rightNow.add(Calendar.DAY_OF_YEAR,7);//日期加10天
        Date dt1=rightNow.getTime();
		m.setMeetingEndTime(dt1);
		
		mgr.createMeeting(m);
		addActionMessage("增加成功");

		return SUCCESS;
	}
	
}
