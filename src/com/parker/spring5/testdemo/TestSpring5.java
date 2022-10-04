package com.parker.spring5.testdemo;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.parker.spring5.Order;

public class TestSpring5 {

    @Test
    public void testAdd(){
      // 1. 加载spring的配置文件
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("bean1.xml");

        // 配置创建的对象

        Order order = context.getBean("order", Order.class);
        System.out.println(order);  // 输出book 对象的地址
        order.printOrder();


    }
}
