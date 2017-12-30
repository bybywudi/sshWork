package dao.impl;

import java.util.List;

import dao.UpFileDao;
import domain.Employee;
import domain.UpFile;

public class UpFileDaoHibernate4 extends BaseDaoHibernate4Impl<UpFile> implements UpFileDao 
{	
	private static final int REPORTFILETYPE = 0;
	
	public List<UpFile> findByUserId(int userId,int fileType)
	{
		return find("select f from UpFile f where f.userId = ?0 and f.fileType = ?1 order by f.id desc",userId,fileType);

	}
	
	public UpFile findByReportId(int reportId)
	{
		List<UpFile> upfiles = find("select f from UpFile f where f.corrId = ?0 and f.fileType=?1", reportId,REPORTFILETYPE);
		if (upfiles!= null && upfiles.size() >= 1)
		{
			return upfiles.get(0);
		}
		return null;
	}
	
}
