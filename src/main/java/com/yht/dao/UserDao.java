package com.yht.dao;

import com.yht.anno.DemoAnno;
import org.springframework.stereotype.Component;

/**
 * 2018/9/19 6:11
 **/
@Component
public class UserDao implements Dao{

    @DemoAnno
    public void add(){

        System.out.println("add.......");
//        int i=1/0;

    }


    public void say(String str){
        System.out.println("hello "+str);
    }
}
