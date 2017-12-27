package dao.impl;

import java.util.*;
import java.text.*;

import domain.*;

import dao.AttendDao;

import dao.impl.BaseDaoHibernate4Impl;
import dao.*;


public class AttendDaoHibernate4 extends BaseDaoHibernate4Impl<Attend>
	implements AttendDao
{

	public List<Attend> findByEmpAndMonth(Employee emp , String month)
	{
		return find("from Attend as a where a.employee=?0 " +
			"and substring(a.dutyDay , 0 , 7)=?1" , emp , month);
	}

	/**
	 * ����Ա�������ڲ�ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay ����
	 * @return ��Ա����ĳ��Ĵ򿨼�¼����
	 */
	public List<Attend> findByEmpAndDutyDay(Employee emp
		, String dutyDay)
	{
		return find("from Attend as a where a.employee=?0 and "
			+ "a.dutyDay=?1" , emp , dutyDay);
	}

	/**
	 * ����Ա�������� �����°��ѯ��Ա���Ĵ򿨼�¼����
	 * @param emp Ա��
	 * @param dutyDay ����
	 * @param isCome �Ƿ��ϰ�
	 * @return ��Ա����ĳ���ϰ���°�Ĵ򿨼�¼
	 */
	public Attend findByEmpAndDutyDayAndCome(Employee emp ,
		String dutyDay , boolean isCome)
	{
		List<Attend> al = findByEmpAndDutyDay(emp , dutyDay);
		if (al != null || al.size() > 1)
		{
			for (Attend attend : al)
			{
				if (attend.getIsCome() == isCome )
				{
					return attend;
				}
			}
		}
		return null;
	}

	/**
	 * �鿴Ա��ǰ����ķ�������
	 * @param emp Ա��
	 * @return ��Ա����ǰ����ķ�������
	 */
	public List<Attend> findByEmpUnAttend(Employee emp
		, AttendType type)
	{
		//查询非正常出勤，type变量应该传入1，代表除了正常出勤外的类型
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		String end = sdf.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, -3);
		String start = sdf.format(c.getTime());
		return find("from Attend as a where a.employee=?0 and "
			+ "a.type != ?1 and a.dutyDay between ?2 and ?3" ,
			emp , type , start , end);
	}
}
