package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import action.base.MgrBaseAction;
import domain.UpFile;

public class FileDownloadAction extends MgrBaseAction{

		private int id;
		private String fileName;

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFileName() {
			return fileName;
		}


		public void setFileName(String fileName) {
			this.fileName = fileName;
		}


		public InputStream getTargetFile() throws Exception
		{
			UpFile upFile = mgr.findFile(id);
			setFileName(new String(upFile.getFileName().getBytes(),"ISO8859-1"));
			File file = new File(upFile.getSavePath()+System.getProperty("file.separator")+upFile.getUuidName()); 
			InputStream is= new FileInputStream(file);
			return is;
			/*return ServletActionContext.getServletContext()
				.getResourceAsStream(inputPath);*/
		}
}
