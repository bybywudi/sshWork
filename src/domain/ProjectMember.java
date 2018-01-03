package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="projectmember_inf")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class ProjectMember implements Serializable{
	private static final long serialVersionUID = 48L;
	
	@Id @Column(name="member_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	 
	//标志这个项目成员是由谁来管理的
	@Column(name="member_mgrid",nullable=false)
	private Integer mgrId;
	
	//项目成员的真实姓名
	@Column(name="member_name")
	private String name;
	
	@Column(name="member_introduction",nullable=false,length=5000)
	private String introduction;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMgrId() {
		return mgrId;
	}

	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public ProjectMember(Integer id, Integer mgrId, String name, String introduction) {
		this.id = id;
		this.mgrId = mgrId;
		this.name = name;
		this.introduction = introduction;
	}

	public ProjectMember() {

	}


	

}
