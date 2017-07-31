package com.wchstrife.controller;

import com.wchstrife.dao.ArticleDao;
import com.wchstrife.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangchenghao on 2017/7/31.
 */
@Controller
public class ArticleController {

    @Autowired
    ArticleDao articleDao;

    @RequestMapping("/get/{id}")
    public String index(Model model, @PathVariable(name = "id") String id){

        Article article =  (Article) articleDao.findOne(id);

        System.out.println(article.getId());

        model.addAttribute("article", article);

        return "index";
    }
}
