package com.yht.test;

import com.yht.config.AppConfig;
import com.yht.dao.Dao;
import com.yht.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 2018/9/19 6:16
 **/
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Dao userDao=context.getBean(Dao.class);
        userDao.add();
        userDao.say("王强");
    }
}
