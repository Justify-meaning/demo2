package org.example;

import autowire.Emp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Hcs
 * @Date 2021-7-3 18:04
 * @Version 1.0
 */
public class TestAutowire {
    @Test
    public void testAutowire(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

}