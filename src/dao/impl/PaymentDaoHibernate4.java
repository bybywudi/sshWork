package dao.impl;

import java.util.*;
import java.text.*;

import domain.*;

import dao.AttendDao;

import dao.impl.BaseDaoHibernate4Impl;
import dao.*;
public class PaymentDaoHibernate4 extends BaseDaoHibernate4Impl<Payment>
	implements PaymentDao
{


	public List<Payment> findByEmp(Employee emp)
	{
		return find("select p from Payment as p where p.employee=?0" , emp);
	}



	public Payment findByMonthAndEmp(String payMonth
		 , Employee emp)
	{
		List<Payment> pays = find("select p from Payment as p where"
			+ " p.employee=?0 and p.payMonth=?1" , emp , payMonth);
		if (pays != null && pays.size() > 0)
		{
			return pays.get(0);
		}
		return null;
	}
}
