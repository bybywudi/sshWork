package vo;

import java.io.Serializable;

import domain.Report;
import domain.UpFile;

public class ReportBean implements Serializable{
	
	private static final long serialVersionUID = 48L;
	
	private Report report;
	private UpFile upfile;
	private String relacedContent;
	private String realName;
	
	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public ReportBean() {
	}
	
	public ReportBean(Report report, UpFile upfile, String relacedContent) {
		this.report = report;
		this.upfile = upfile;
		this.relacedContent = relacedContent;
	}

	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	public UpFile getUpfile() {
		return upfile;
	}
	public void setUpfile(UpFile upfile) {
		this.upfile = upfile;
	}
	public String getRelacedContent() {
		return relacedContent;
	}
	public void setRelacedContent(String relacedContent) {
		this.relacedContent = relacedContent;
	}
	
	
}
