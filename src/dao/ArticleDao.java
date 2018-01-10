package dao;

import java.util.List;

import domain.Article;
import domain.UpFile;

public interface ArticleDao extends BaseDao<Article> {
	public Article findAchievementByUserId(int userId);
}
