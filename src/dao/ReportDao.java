package dao;

import java.util.Date;
import java.util.List;

import domain.Report;

public interface ReportDao extends BaseDao<Report>{
	List<Report> findByMgrIdByPage(int mgrId,int pageNo,int pageSize);
	List<Report> findByMgrIdAndEmpIdByPage(int mgrId,int empId,int pageNo,int pageSize);
	List<Report> findByMgrIdAndTimeByPage(int mgrId,String time,int pageNo,int pageSize);
	long findCountByMgrId(int mgrId);
	long findCountByMgrIdAndTime(int mgrId,String time);
	long findCountByMgrIdAndEmpId(int mgrId,int empId);
}
