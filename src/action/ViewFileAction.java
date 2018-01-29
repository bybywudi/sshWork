package action;

import java.util.List;

import action.base.MgrBaseAction;
import domain.UpFile;
import vo.ListMeetingBean;
import vo.ReportBean;

public class ViewFileAction extends MgrBaseAction
{
	private int id;
	private UpFile file;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UpFile getFile() {
		return file;
	}

	public void setFile(UpFile file) {
		this.file = file;
	}

	public String empViewFile()
		throws Exception
	{
		setFile(mgr.findFile(id));
		
		return SUCCESS;
	}
	
	public String mgrViewFile()
			throws Exception
		{
			
			setFile(mgr.findFile(id));
			return SUCCESS;
		}
}



