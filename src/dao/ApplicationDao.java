package dao;

import java.util.List;

import dao.BaseDao;
import domain.Application;
import domain.Employee;
public interface ApplicationDao extends BaseDao<Application> {
	/**
	 * 根据员工查询未处理的异动申请
	 * @param emp 需要查询的员工
	 * @return 该员工对应的未处理的异动申请
	 */
	List<Application> findByEmp(Employee emp);
}
