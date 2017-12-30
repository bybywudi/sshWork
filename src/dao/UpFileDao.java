package dao;

import java.util.List;

import domain.UpFile;

public interface UpFileDao extends BaseDao<UpFile> {

	List<UpFile> findByUserId(int userId,int fileType);
	UpFile findByReportId(int reportId);
}
