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
@Table(name="file_inf")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class UpFile implements Serializable{
	private static final long serialVersionUID = 48L;
	
	@Id @Column(name="file_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	 
	@Column(name="file_userid",nullable=false)
	private Integer userId;
	
	//文件类型，0代表上传给老师的报告文件，1代表会议相关文件，2代表个人文档，代码等文件，3代表论文成果文件,4代表展示的照片文件
	@Column(name="file_type",nullable=false)
	private Integer fileType;
	
	//相关ID，如果fileType是0，则代表报告的ID，如果是1，则代表会议的ID，如果是2，则可以为空
	@Column(name="file_corrid")
	private Integer corrId;
	
	@Column(name="file_uuidname",nullable=false)
	private String uuidName;
	
	@Column(name="file_name",nullable=false,length=255)
	private String fileName;
	
	@Column(name="file_savePath",nullable=false,length=500)
	private String savePath;
	
	@Column(name="file_uptime")
	private String upTime;
	
	@Column(name="file_description")
	private String description;

	
	
	public UpFile(Integer id, Integer userId, Integer fileType, Integer corrId, String uuidName, String fileName,
			String savePath, String upTime, String description) {
		this.id = id;
		this.userId = userId;
		this.fileType = fileType;
		this.corrId = corrId;
		this.uuidName = uuidName;
		this.fileName = fileName;
		this.savePath = savePath;
		this.upTime = upTime;
		this.description = description;
	}
	
	
	public UpFile() {
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getFileType() {
		return fileType;
	}

	public void setFileType(Integer fileType) {
		this.fileType = fileType;
	}

	public Integer getCorrId() {
		return corrId;
	}

	public void setCorrId(Integer corrId) {
		this.corrId = corrId;
	}

	public String getUuidName() {
		return uuidName;
	}

	public void setUuidName(String uuidName) {
		this.uuidName = uuidName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String getUpTime() {
		return upTime;
	}

	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
