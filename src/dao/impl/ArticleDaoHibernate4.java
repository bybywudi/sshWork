package dao.impl;

import java.util.List;

import dao.ArticleDao;
import dao.UpFileDao;
import domain.Article;
import domain.Employee;
import domain.UpFile;

public class ArticleDaoHibernate4 extends BaseDaoHibernate4Impl<Article> implements ArticleDao 
{	
	private static final int ACHIEVMENTTYPE = 0;

	public Article findAchievementByUserId(int userId) {
		List<Article> article = find("select a from Article a where a.userId = ?0 and a.articleType=?1", userId,ACHIEVMENTTYPE);
		if (article!= null && article.size() >= 1)
		{
			return article.get(0);
		}
		return null;

	}

	
	
}
