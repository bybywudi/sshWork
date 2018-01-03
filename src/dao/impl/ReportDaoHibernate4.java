package dao.impl;

import java.util.Date;
import java.util.List;

import dao.ReportDao;
import domain.Report;
import domain.SetMgrApp;

public class ReportDaoHibernate4 extends BaseDaoHibernate4Impl<Report>
	implements ReportDao 
{
	public List<Report> findByMgrIdByPage(int mgrId,int pageNo,int pageSize)
	{
		return findByPage("select r from Report as r where r.mgrId=?0 order by r.id desc",pageNo,pageSize,mgrId);
	}
	
	public List<Report> findByMgrIdAndEmpIdByPage(int mgrId,int empId,int pageNo,int pageSize)
	{
		return findByPage("select r from Report as r where r.mgrId=?0 and r.empId=?1 order by r.id desc",pageNo,pageSize,mgrId,empId);
	}
	
	public List<Report> findByMgrIdAndTimeByPage(int mgrId,String time,int pageNo,int pageSize)
	{
		return findByPage("select r from Report as r where r.mgrId=?0 and r.reportTime like ?1 order by r.id desc",pageNo,pageSize,mgrId,time+"%");
	}
	
	public long findCountByMgrId(int mgrId)
	{
		List<?> l = find("select count(*) from Report as r where r.mgrId=?0",mgrId);
		// 返回查询得到的实体总数
		if (l != null && l.size() == 1 )
		{
			return (Long)l.get(0);
		}
		return 0;
	}
	
	public long findCountByMgrIdAndTime(int mgrId,String time)
	{
		List<?> l = find("select count(*) from Report as r where r.mgrId=?0 and r.reportTime like ?1",mgrId,time);
		// 返回查询得到的实体总数
		if (l != null && l.size() == 1 )
		{
			return (Long)l.get(0);
		}
		return 0;
	}
	
	public long findCountByMgrIdAndEmpId(int mgrId,int empId)
	{
		List<?> l = find("select count(*) from Report as r where r.mgrId=?0 and r.empId=?1",mgrId,empId);
		// 返回查询得到的实体总数
		if (l != null && l.size() == 1 )
		{
			return (Long)l.get(0);
		}
		return 0;
	}
}
