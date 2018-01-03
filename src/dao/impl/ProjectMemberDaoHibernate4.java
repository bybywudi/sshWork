package dao.impl;

import java.util.List;

import dao.ProjectMemberDao;
import dao.UpFileDao;
import domain.Employee;
import domain.ProjectMember;
import domain.UpFile;

public class ProjectMemberDaoHibernate4 extends BaseDaoHibernate4Impl<ProjectMember> implements ProjectMemberDao 
{	

	public List<ProjectMember> findByMgrId(int mgrId)
	{
		return find("select p from ProjectMember p where p.mgrId = ?0 order by p.id",mgrId);

	}
	

}
