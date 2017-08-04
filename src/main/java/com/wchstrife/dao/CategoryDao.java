package com.wchstrife.dao;

import com.wchstrife.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wangchenghao on 2017/8/3.
 */
@Repository
public interface CategoryDao extends JpaRepository<Category, String>{

    Category findByName(String name);
}
