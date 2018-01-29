package dao.impl;

import java.util.Date;
import java.util.List;

import dao.MeetingDao;
import domain.Meeting;

public class MeetingDaoHibernate4 extends BaseDaoHibernate4Impl<Meeting>
	implements MeetingDao 
{
	public List<Meeting> findByMgrIdByPage(int mgrId,int pageNo,int pageSize)
	{
		return findByPage("select m from Meeting as m where m.mgrId=?0 order by m.id desc",pageNo,pageSize,mgrId);
	}
	
	public List<Meeting> findByMgrIdAndEndTimeByPage(int mgrId,int pageNo,int pageSize)
	{
		return findByPage("select m from Meeting as m where m.mgrId=?0 and current_time() between m.meetingStartTime and m.meetingEndTime order by m.id desc",pageNo,pageSize,mgrId);
	}
	
	
	public long findCountByMgrId(int mgrId)
	{
		List<?> l = find("select count(*) from Meeting as m where m.mgrId=?0",mgrId);
		// 返回查询得到的实体总数
		if (l != null && l.size() == 1 )
		{
			return (Long)l.get(0);
		}
		return 0;
	}
	
	public long findCountByMgrIdAndEndTime(int mgrId)
	{	
		Date currentTime = new Date();
		List<?> l = find("select count(*) from Meeting as m where m.mgrId=?0 and current_time() between m.meetingStartTime and m.meetingEndTime",mgrId);
		// 返回查询得到的实体总数
		if (l != null && l.size() == 1 )
		{
			return (Long)l.get(0);
		}
		return 0;
	}

}
