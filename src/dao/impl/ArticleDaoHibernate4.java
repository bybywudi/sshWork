package dao.impl;

import java.util.List;

import dao.ArticleDao;
import dao.UpFileDao;
import domain.Article;
import domain.Employee;
import domain.Report;
import domain.UpFile;

public class ArticleDaoHibernate4 extends BaseDaoHibernate4Impl<Article> implements ArticleDao 
{	
	private static final int ACHIEVMENTTYPE = 0;
	private static final int MESSAGETTYPE = 1;

	public Article findAchievementByUserId(int userId) {
		List<Article> article = find("select a from Article a where a.userId = ?0 and a.articleType=?1", userId,ACHIEVMENTTYPE);
		if (article!= null && article.size() >= 1)
		{
			return article.get(0);
		}
		return null;

	}
	
	public List<Article> findMessageByUserId(int userId) {
		return find("select a from Article a where a.userId = ?0 and a.articleType=?1", userId,MESSAGETTYPE);

	}
	
	public List<Article> findMessageByMgrIdByPage(int mgrId,int pageNo,int pageSize)
	{
		return findByPage("select a from Article a where a.userId = ?0 and a.articleType=?1 order by a.id desc",pageNo,pageSize,mgrId,MESSAGETTYPE);
	}
	
	public long findMessageCountByMgrId(int mgrId)
	{
		List<?> l = find("select count(*) from Article as a where a.userId=?0 and a.articleType=?1",mgrId,MESSAGETTYPE);
		// 返回查询得到的实体总数
		if (l != null && l.size() == 1 )
		{
			return (Long)l.get(0);
		}
		return 0;
	}
	
	
}
