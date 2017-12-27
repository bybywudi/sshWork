package dao;

import java.util.List;

import dao.BaseDao;
import domain.SetMgrApp;
import domain.Employee;
public interface SetMgrDao extends BaseDao<SetMgrApp> {
	public List<SetMgrApp> findByMgr(String mgrName);
	public void setDeleteFlag(String mgrName,int empId);
	public SetMgrApp findByMgrNameAndEmpId(String mgrName,int empId);
	void setAllDeleteFlag(String mgrName,int empId);
}
