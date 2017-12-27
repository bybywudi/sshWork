package dao.impl;

import java.util.*;

import dao.SetMgrDao;
import domain.Application;
import domain.Employee;
import domain.SetMgrApp;


public class SetMgrDaoHibernate4 extends BaseDaoHibernate4Impl<SetMgrApp>
	implements SetMgrDao
{
	private static final int DELETEFLAG = 0;
	public List<SetMgrApp> findByMgr(String mgrName)
	{
		return find("select a from SetMgrApp as a where a.mgrName=?0 and a.deleteFlag=?1 ",mgrName,DELETEFLAG);
	}
	
	public void setDeleteFlag(String mgrName,int empId) {
		List<SetMgrApp> smas = find("select a from SetMgrApp as a where a.empId=?0 and a.mgrName=?1",empId,mgrName);
		if (smas!= null && smas.size() >= 1)
		{
			SetMgrApp sma = smas.get(0);
			sma.setDeleteFlag(1);
			update(sma);
		}
	}
	
	public void setAllDeleteFlag(String mgrName,int empId) {
		List<SetMgrApp> smas = find("select a from SetMgrApp as a where a.empId=?0 and a.deleteFlag=?1",empId,DELETEFLAG);
		
		for(SetMgrApp sma : smas) {
			sma.setDeleteFlag(1);
			update(sma);
		}


	}
	
	public SetMgrApp findByMgrNameAndEmpId(String mgrName,int empId) {
		List<SetMgrApp> smas = find("select e from SetMgrApp e where e.mgrName = ?0 and e.empId=?1 and e.deleteFlag=?2"
				, mgrName,empId,DELETEFLAG);
			if (smas!= null && smas.size() >= 1)
			{
				return smas.get(0);
			}
			return null;
	}
}
