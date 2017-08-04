package com.wchstrife.service;

import com.wchstrife.dao.ArticleDao;
import com.wchstrife.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by wangchenghao on 2017/8/1.
 */
@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public Article getById(String id){
        Article article = articleDao.findOne(id);

        return article;
    }

    /**
     *查询所有列表
     * @return
     */
    public List<Article> list(){
        List<Article> articles = articleDao.findAll();

        return articles;
    }

    /**
     * 根据种类名称查询文章
     * @param categoryName
     */
    public List<Article> getArticleByCategoryName(String categoryName){

        return articleDao.findAllByCategory_Name(categoryName);
    }


    public void writeBlog(Article article){

    }

    /**
     * 删除文章
     * @param id
     */
    public void delete(String id){
        articleDao.delete(id);
    }

    public void save(Article article){
        articleDao.save(article);
    }
}
