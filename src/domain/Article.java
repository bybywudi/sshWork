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
@Table(name="article_inf")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Article implements Serializable{
	private static final long serialVersionUID = 48L;
	
	@Id @Column(name="article_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	 
	@Column(name="article_userid",nullable=false)
	private Integer userId;
	
	//类型，0代表要管理的成果综述
	@Column(name="article_type",nullable=false)
	private Integer articleType;

	@Column(name="article_title")
	private String title;
	
	@Column(name="article_uptime")
	private String upTime;
	
	@Column(name="article_content",nullable=false,length=10000)
	private String content;

	public Article(Integer id, Integer userId, Integer articleType, String savePath, String upTime, String content) {
		this.id = id;
		this.userId = userId;
		this.articleType = articleType;
		this.title = savePath;
		this.upTime = upTime;
		this.content = content;
	}

	
	public Article() {
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

	public Integer getArticleType() {
		return articleType;
	}

	public void setArticleType(Integer articleType) {
		this.articleType = articleType;
	}

	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getUpTime() {
		return upTime;
	}

	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	

}
