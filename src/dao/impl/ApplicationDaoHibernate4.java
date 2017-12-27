package dao.impl;

import java.util.*;

import dao.ApplicationDao;
import domain.Application;
import domain.Employee;


public class ApplicationDaoHibernate4 extends BaseDaoHibernate4Impl<Application>
	implements ApplicationDao
{

	public List<Application> findByEmp(Employee emp)
	{
		return find("select a from Application as a where "
			+ "a.attend.employee=?0" , emp);
	}
}
