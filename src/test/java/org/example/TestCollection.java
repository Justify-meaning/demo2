package org.example;

import factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Hcs
 * @Date 2021-7-2 14:53
 * @Version 1.0
 */
public class TestCollection {
    @Test
    public void TestCollections(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Stu.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.show();
    }

    @Test
    public void TestCollections_excerpt(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Stu_excerpt.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
        //book.show();
    }

    @Test
    public void TestCollections_MyBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("MyBean.xml");
        //返回指定的bean类型
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }
}