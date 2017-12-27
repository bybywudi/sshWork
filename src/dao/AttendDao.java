package dao;

import java.util.List;

import domain.Attend;
import domain.AttendType;
import domain.Employee;

public interface AttendDao extends BaseDao<Attend> {
	/**
	 * 根据员工、月份查询该员工的出勤记录
	 * @param emp 员工
	 * @param month 月份，月份是形如"2012-02"格式的字符串
	 * @return 该员工、指定月份的全部出勤记录
	 */
	List<Attend> findByEmpAndMonth(Employee emp , String month);

	/**
	 * 根据员工、日期查询该员工的打卡记录集合
	 * @param emp 员工
	 * @param dutyDay 日期
	 * @return 该员工的某天的打卡记录集合
	 */
	List<Attend> findByEmpAndDutyDay(Employee emp
		, String dutyDay);

	/**
	 * 根据员工、日期 、上下班查询该员工的打卡记录集合
	 * @param emp 员工
	 * @param dutyDay 日期
	 * @param isCome 是否上班
	 * @return 该员工的某天上班或下班的打卡记录
	 */
	Attend findByEmpAndDutyDayAndCome(Employee emp ,
		String dutyDay , boolean isCome);

	/**
	 * 查看员工前三天的非正常打卡
	 * @param emp 员工
	 * @return 该员工的前三天的非正常打卡
	 */
	List<Attend> findByEmpUnAttend(Employee emp
		, AttendType type);
}
