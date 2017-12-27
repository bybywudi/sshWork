package domain;

import java.io.Serializable;
import java.sql.Date;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import javax.persistence.*;


@Entity
@Table(name="setmgrapp_inf")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class SetMgrApp
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	
	@Id	@Column(name="app_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="app_comment" , length=50)
	private String comment;

	@Column(name="app_result")
	private boolean result;
	
	@Column(name="app_mgrname")
	private String mgrName;
	
	@Column(name="app_empid")
	private int empId;
	
	@Column(name="app_emprealname")
	private String empRealName;
	
	@Column(name="app_deleteflag")
	private int deleteFlag;
	
	@Column(name="app_time")
	private String appTime;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getMgrName() {
		return mgrName;
	}

	public void setMgrName(String mgrName) {
		this.mgrName = mgrName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
	
	public String getEmpRealName() {
		return empRealName;
	}

	public void setEmpRealName(String empRealName) {
		this.empRealName = empRealName;
	}

	public String getAppTime() {
		return appTime;
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

	public SetMgrApp() {
	}

	public SetMgrApp(Integer id, String comment, boolean result, String mgrName, int empId, String empRealName,
			int deleteFlag, String appTime) {
		this.id = id;
		this.comment = comment;
		this.result = result;
		this.mgrName = mgrName;
		this.empId = empId;
		this.empRealName = empRealName;
		this.deleteFlag = deleteFlag;
		this.appTime = appTime;
	}

	
	
	
	
}