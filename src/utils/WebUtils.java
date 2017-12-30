package utils;

import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.imageio.ImageIO;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class WebUtils {
	

	//生成全球唯一ID
	public static String generateID() {
		
		
		return UUID.randomUUID().toString();
		
	}
	
	public static String generateFilename(String filename) {
		
		String ext = filename.substring(filename.lastIndexOf(".")+1);
		return UUID.randomUUID().toString() + "." + ext;
		
	}
	
	public static String generateSavePath(String path,String filename) {
		int hashcode = filename.hashCode();
		int dir1 = hashcode&15;
		int dir2 = (hashcode>>4)&0xf;
		
		String savepath = path + File.separator +dir1 + File.separator + dir2;
		File file = new File(savepath);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		return savepath;
	}
	

}
