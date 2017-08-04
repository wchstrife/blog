package com.wchstrife.service;

import com.wchstrife.dao.UserDao;
import com.wchstrife.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangchenghao on 2017/8/2.
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public boolean login(String username, String password){
        User user = userDao.findByUsernameAndPassword(username, password);
        if(null == user){

            return false;
        }else {

            return true;
        }
    }
}
