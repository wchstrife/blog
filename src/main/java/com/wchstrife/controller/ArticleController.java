package com.wchstrife.controller;

import com.wchstrife.dao.ArticleDao;
import com.wchstrife.entity.Article;
import com.wchstrife.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tautua.markdownpapers.Markdown;
import org.tautua.markdownpapers.parser.ParseException;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

/**
 * Created by wangchenghao on 2017/7/31.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("/get/{id}")
    public String get(Model model, @PathVariable(name = "id") String id){

        return "index";
    }

    /*
    TODO：分页
     */
    @RequestMapping("/")
    public String list(Model model){
        List<Article> articles = articleService.list();
        model.addAttribute("articles", articles);

        return "front/index";
    }

    /*
    按类型显示博客
     */
    @RequestMapping("/column/{displayname}/{category}")
    public String column(@PathVariable("displayname") String dispalyname, @PathVariable("category") String category, Model model){
        model.addAttribute("articles", articleService.getArticleByCategoryName(category));
        model.addAttribute("displayName", dispalyname);

        return "front/columnPage";
    }

    /**
     * 显示详细信息
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/detail/{id}")
    public String detail(@PathVariable("id") String id, Model model){
        System.out.println(id);
        Article article = articleService.getById(id);
        System.out.println(article.getId());
        Markdown markdown = new Markdown();
        try {
            StringWriter out = new StringWriter();
            markdown.transform(new StringReader(article.getContent()), out);
            out.flush();
            article.setContent(out.toString());
        }catch (ParseException e){
            e.printStackTrace();
        }
        model.addAttribute("article", article);

        return "front/detail";
    }


}
