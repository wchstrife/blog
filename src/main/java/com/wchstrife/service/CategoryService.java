package com.wchstrife.service;

import com.wchstrife.dao.CategoryDao;
import com.wchstrife.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangchenghao on 2017/8/3.
 */
@Service
public class CategoryService {

    @Autowired
    CategoryDao categoryDao;

    /**
     * 查询所有的类型
     * @return
     */
    public List<Category> list(){
        List<Category> categories = categoryDao.findAll();

        return categories;
    }

    /**
     * 根据ID获取一个类型
     * @param id
     * @return
     */
    public Category get(String id){

        return categoryDao.findOne(id);
    }

    /**
     * 根据类型名称获取一个类型
     * @param name
     * @return
     */
    public Category fingdByName(String name){

        return categoryDao.findByName(name);
    }
}
