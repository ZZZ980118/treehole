package com.yhw.login.service;

import com.yhw.login.bean.User;
import com.yhw.login.dao.LoginDao;

public class LoginService {
    public User login(User user) {
        LoginDao loginDao=new LoginDao();
        User user1=loginDao.login(user);

        return user1;
    }
}
