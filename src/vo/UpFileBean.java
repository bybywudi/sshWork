package vo;

import java.io.Serializable;
import java.util.List;

import domain.UpFile;

public class UpFileBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	
	//该bean封装的数据在MgrManagerImpl类的 public List<EmpBean> getEmpsByMgr(String mgr)中定义
	private UpFile file;
	private String userName;
	private String source;//文件来源

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public UpFile getFile() {
		return file;
	}
	public void setFile(UpFile file) {
		this.file = file;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}