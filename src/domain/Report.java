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
@Table(name="report_inf")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Report implements Serializable {
	private static final long serialVersionUID = 48L;
	
	@Id @Column(name="rep_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="rep_headline", nullable=false, length=50)
	private String headline;
	
	@Column(name="rep_content", nullable=false, length=1000)
	private String content;
	
	@Column(name="rep_mgrid", nullable=false)
	private Integer mgrId;
	
	@Column(name="rep_empid", nullable=false)
	private Integer empId;
	
	@Column(name="rep_time", nullable=false, length=50)
	private String reportTime;
	
	

	public Report(Integer id, String headline, String content, Integer mgrId, Integer empId, String reportTime) {
		this.id = id;
		this.headline = headline;
		this.content = content;
		this.mgrId = mgrId;
		this.empId = empId;
		this.reportTime = reportTime;
	}

	
	public Report() {
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

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getReportTime() {
		return reportTime;
	}

	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
