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

public class ToReportMeetingAction extends MgrBaseAction
{	
	
	private int id;
	private int mid;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}

	public String execute()
		throws Exception
	{		
		setMid(id);
		return SUCCESS;
	}
	
}
