package org.example;

import bean.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Hcs
 * @Date 2021-7-3 17:11
 * @Version 1.0
 */
public class TestBean {
    @Test
    public void testBean(){
        //ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext("Orders_Bean.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("Orders_Bean.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步：获取创建bean实例");
        System.out.println(orders);

    //    手动让bean实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }
}