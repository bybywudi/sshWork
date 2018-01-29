package vo;

import java.util.List;

import domain.Meeting;
import domain.UpFile;

public class ListMeetingBean {
	private Meeting meeting;
	private List<UpFileBean> files;
	public Meeting getMeeting() {
		return meeting;
	}
	public void setMeeting(Meeting meeting) {
		this.meeting = meeting;
	}
	public List<UpFileBean> getFiles() {
		return files;
	}
	public void setFiles(List<UpFileBean> files) {
		this.files = files;
	}

	
	
}
