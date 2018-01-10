package dao.impl;

import java.util.List;

import dao.UpFileDao;
import domain.Employee;
import domain.UpFile;

public class UpFileDaoHibernate4 extends BaseDaoHibernate4Impl<UpFile> implements UpFileDao 
{	
	private static final int REPORTFILETYPE = 0;
	private static final int PAPERFILETYPE = 3;
	private static final int PROJECT_MEMBER_PIC_TYPE = 4;
	private static final int PATENTTYPE = 5;
	
	
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
	
	public List<UpFile> findPaperByMgrIdByPage(int mgrId,int pageNo,int pageSize) {
		return findByPage("select f from UpFile f where f.userId = ?0 and f.fileType=?1 order by f.id desc", pageNo,pageSize,mgrId,PAPERFILETYPE);

	}
	
	public List<UpFile> findPatentByMgrIdByPage(int mgrId,int pageNo,int pageSize) {
		return findByPage("select f from UpFile f where f.userId = ?0 and f.fileType=?1 order by f.id desc", pageNo,pageSize,mgrId,PATENTTYPE);

	}
	
	public long findPaperCountByMgrId(int mgrId)
	{
		List<?> l = find("select count(*) from UpFile as f where f.userId=?0 and f.fileType=?1",mgrId,PAPERFILETYPE);
		// 返回查询得到的实体总数
		if (l != null && l.size() == 1 )
		{
			return (Long)l.get(0);
		}
		return 0;
	}
	
	public UpFile findByProjectMemberId(int pmId)
	{
		List<UpFile> upfiles = find("select f from UpFile f where f.corrId = ?0 and f.fileType=?1", pmId,PROJECT_MEMBER_PIC_TYPE);
		if (upfiles!= null && upfiles.size() >= 1)
		{
			return upfiles.get(0);
		}
		return null;
	}
}
