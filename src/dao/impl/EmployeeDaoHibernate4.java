package dao.impl;

import java.util.*;
import java.text.*;

import domain.*;

import dao.AttendDao;

import dao.impl.BaseDaoHibernate4Impl;
import dao.*;
public class EmployeeDaoHibernate4 extends BaseDaoHibernate4Impl<Employee>
	implements EmployeeDao
{
	/**
	 * �����û����������ѯԱ��
	 * @param emp ����ָ���û����������Ա��
	 * @return ����ָ���û����������Ա������
	 */
	public List<Employee> findByNameAndPass(Employee emp)
	{
		return find("select p from Employee p where p.name = ?0 and p.pass=?1"
			, emp.getName() , emp.getPass());
	}

	/**
	 * �����û�����ѯԱ��
	 * @param name Ա�����û���
	 * @return �����û�����Ա��
	 */
	public Employee findByName(String name)
	{
		List<Employee> emps = find("select e from Employee e where e.name = ?0"
			, name);
		if (emps!= null && emps.size() >= 1)
		{
			return emps.get(0);
		}
		return null;
	}
	
	public Employee findById(int id)
	{
		List<Employee> emps = find("select e from Employee e where e.id = ?0"
			, id);
		if (emps!= null && emps.size() >= 1)
		{
			return emps.get(0);
		}
		return null;
	}
}
