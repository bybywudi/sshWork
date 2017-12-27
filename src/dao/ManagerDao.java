package dao;

import java.util.List;

import domain.Manager;

public interface ManagerDao extends BaseDao<Manager> {
	/**
	 * 根据用户名和密码查询经理
	 * @param emp 包含指定用户名、密码的经理
	 * @return 符合指定用户名和密码的经理
	 */
	List<Manager> findByNameAndPass(Manager mgr);

	/**
	 * 根据用户名查找经理
	 * @param name 经理的名字
	 * @return 名字对应的经理
	 */
	Manager findByName(String name);
}
