package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="meeting_inf")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Meeting implements Serializable {
	private static final long serialVersionUID = 48L;
	
	@Id @Column(name="meeting_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="meeting_headline",length=50)
	private String headline;
	
	@Column(name="meeting_content",length=1000)
	private String content;
	
	@Column(name="meeting_mgrid", nullable=false)
	private Integer mgrId;
	
	@Column(name="meeting_starttime",length=255)
	private Date meetingStartTime;
	
	@Column(name="meeting_endtime",length=255)
	private Date meetingEndTime;
	
	@Column(name="meeting_student",length=255)
	private String studentName;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getMgrId() {
		return mgrId;
	}

	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}

	public Date getMeetingStartTime() {
		return meetingStartTime;
	}

	public void setMeetingStartTime(Date meetingStartTime) {
		this.meetingStartTime = meetingStartTime;
	}

	public Date getMeetingEndTime() {
		return meetingEndTime;
	}

	public void setMeetingEndTime(Date meetingEndTime) {
		this.meetingEndTime = meetingEndTime;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Meeting(Integer id, String headline, String content, Integer mgrId, Date meetingStartTime,
			Date meetingEndTime, String studentName) {
		this.id = id;
		this.headline = headline;
		this.content = content;
		this.mgrId = mgrId;
		this.meetingStartTime = meetingStartTime;
		this.meetingEndTime = meetingEndTime;
		this.studentName = studentName;
	}

	public Meeting() {
	}

	
	
}
