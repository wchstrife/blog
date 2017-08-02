package com.wchstrife.controller;

import com.wchstrife.entity.Article;
import com.wchstrife.entity.User;
import com.wchstrife.service.ArticleService;
import com.wchstrife.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wangchenghao on 2017/8/2.
 */
@Controller
@RequestMapping("/admin")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    ArticleService articleService;

    /**
     * 后台主页
     */
    @RequestMapping("")
    public String admin(Model model){
        List<Article> articles = articleService.list();
        model.addAttribute("articles", articles);

        return "admin/index";
    }

    @RequestMapping("/login")
    public String login(){

        return "admin/login";
    }

    /**
     * 登录
     * @param user
     * @param model
     * @return
     */
    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    public String doLogin(HttpSession session, User user, Model model){

        if(userService.login(user.getUsername(), user.getPassword())){
            session.setAttribute("user", user);
            model.addAttribute("user", user);

            return "redirect:/admin";
        }else {
            model.addAttribute("error", "用户名或者密码错误");

            return "admin/login";
        }
    }

    /**
     * 删除博客
     * @param id
     * @return
     */
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id){
        articleService.delete(id);

        return "redirect:/admin";
    }
}
