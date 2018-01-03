package vo;

import java.io.Serializable;

import domain.Report;
import domain.UpFile;

public class ReportBean implements Serializable{
	
	private static final long serialVersionUID = 48L;
	
	private Report report;
	private UpFile upfile;
	
	
	public ReportBean() {
	}
	public ReportBean(Report report, UpFile upfile) {

		this.report = report;
		this.upfile = upfile;
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
	
	
}
