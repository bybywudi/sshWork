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
}
