package dao;

import java.util.List;

import domain.UpFile;

public interface UpFileDao extends BaseDao<UpFile> {

	List<UpFile> findByUserId(int userId,int fileType);
	UpFile findByReportId(int reportId);
	List<UpFile> findPaperByMgrIdByPage(int mgrId,int pageNo,int pageSize);
	long findPaperCountByMgrId(int mgrId);
	UpFile findByProjectMemberId(int pmId);
	List<UpFile> findPatentByMgrIdByPage(int mgrId,int pageNo,int pageSize);
	long findPatentCountByMgrId(int mgrId);
	List<UpFile> findByMeetingId(int mId);
	List<UpFile> findSharedFileByMgrIdByPage(int pageNo,int pageSize);
	long findSharedFileCount();
	List<UpFile> findAllUserFileByPage(int userId,int pageNo,int pageSize);
	long findUserFilecount(int userId);
}
