package vo;

import java.io.Serializable;

import domain.ProjectMember;
import domain.UpFile;



public class ProjectMemberBean implements Serializable{
	
	private static final long serialVersionUID = 48L;
	
	private ProjectMember pm;
	private UpFile upfile;
	public ProjectMember getPm() {
		return pm;
	}
	public void setPm(ProjectMember pm) {
		this.pm = pm;
	}
	public UpFile getUpfile() {
		return upfile;
	}
	public void setUpfile(UpFile upfile) {
		this.upfile = upfile;
	}
	
}
