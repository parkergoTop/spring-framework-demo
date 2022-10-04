package com.parker.spring5.testdemo;


import com.parker.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {
    @Test
    public void testBean(){
        // 1. 加载spring的配置文件
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("bean2.xml");

        // 配置创建的对象

        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);  // 输出book 对象的地址
        userService.add();


    }
}
