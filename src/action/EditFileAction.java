package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;

import exception.HrException;
import domain.*;
import action.base.MgrBaseAction;

public class EditFileAction extends MgrBaseAction
{
 
	private int id;
	private UpFile upfile;
	
	private String description;
	private String url;
	private String urlName;
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public UpFile getUpfile() {
		return upfile;
	}


	public void setUpfile(UpFile upfile) {
		this.upfile = upfile;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUrlName() {
		return urlName;
	}


	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}


	public String toeditFile()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();
        String level = (String) ctx.getSession().get(WebConstant.LEVEL);

        if(level.equals(WebConstant.MGR_LEVEL)) {
            Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
            if (emp != null) {
                setUpfile(mgr.getFile(id));
                return SUCCESS;
            } else {
                return ERROR;
            }
        }

        if(level.equals(WebConstant.EMP_LEVEL)) {
            Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);
            if (emp != null) {
                setUpfile(mgr.getFile(id));
                return SUCCESS;
            } else {
                return ERROR;
            }
        }

        return ERROR;

	}
	

	public String editFile()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();
        String level = (String) ctx.getSession().get(WebConstant.LEVEL);
        if(level.equals(WebConstant.MGR_LEVEL)){
            Manager emp = (Manager) ctx.getSession().get(WebConstant.USERBEAN);
            if(emp != null) {
                UpFile file = new UpFile();
                file.setId(id);
                file.setDescription(description);
                file.setUrl(url);
                file.setUrlName(urlName);
                file.setFileName(fileName);
                mgr.updateFile(file);
                addActionMessage("修改成功");
                return SUCCESS;
            }else {
                return ERROR;
            }
        }
        if(level.equals(WebConstant.EMP_LEVEL)){
            Employee emp = (Employee) ctx.getSession().get(WebConstant.USERBEAN);
            if(emp != null) {
                UpFile file = new UpFile();
                file.setId(id);
                file.setDescription(description);
                file.setUrl(url);
                file.setUrlName(urlName);
                file.setFileName(fileName);

                mgr.updateFile(file);
                addActionMessage("修改成功");
                return SUCCESS;
            }else {
                return ERROR;
            }
        }
        return ERROR;


	}
}