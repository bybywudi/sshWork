package vo;

import java.io.Serializable;
import java.util.List;

public class ArticleBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	
	//该bean封装的数据在MgrManagerImpl类的 public List<EmpBean> getEmpsByMgr(String mgr)中定义
	private String aTitle;
	private String aContent;
	private String aUpTime;
	
	public ArticleBean(String aTitle, String aContent, String aUpTime) {
		this.aTitle = aTitle;
		this.aContent = aContent;
		this.aUpTime = aUpTime;
	}
	
	public ArticleBean() {
	}

	public String getaTitle() {
		return aTitle;
	}
	public void setaTitle(String aTitle) {
		this.aTitle = aTitle;
	}
	public String getaContent() {
		return aContent;
	}
	public void setaContent(String aContent) {
		this.aContent = aContent;
	}
	public String getaUpTime() {
		return aUpTime;
	}
	public void setaUpTime(String aUpTime) {
		this.aUpTime = aUpTime;
	}
	

}