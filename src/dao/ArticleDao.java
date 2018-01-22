package dao;

import java.util.List;

import domain.Article;
import domain.UpFile;

public interface ArticleDao extends BaseDao<Article> {
	public Article findAchievementByUserId(int userId);
	List<Article> findMessageByUserId(int userId);
	List<Article> findMessageByMgrIdByPage(int mgrId,int pageNo,int pageSize);
	long findMessageCountByMgrId(int mgrId);
}
