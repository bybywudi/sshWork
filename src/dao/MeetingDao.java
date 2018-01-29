package dao;

import java.util.Date;
import java.util.List;

import domain.Meeting;
import domain.Report;

public interface MeetingDao extends BaseDao<Meeting>{
	public List<Meeting> findByMgrIdByPage(int mgrId,int pageNo,int pageSize);
	
	
	public List<Meeting> findByMgrIdAndEndTimeByPage(int mgrId,int pageNo,int pageSize);
	
	
	public long findCountByMgrId(int mgrId);

	
	public long findCountByMgrIdAndEndTime(int mgrId);
}
