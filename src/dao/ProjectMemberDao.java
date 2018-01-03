package dao;

import java.util.List;

import domain.ProjectMember;
import domain.UpFile;

public interface ProjectMemberDao extends BaseDao<ProjectMember> {

	List<ProjectMember> findByMgrId(int mgrId);
	
}
