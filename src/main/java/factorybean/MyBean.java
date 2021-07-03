package factorybean;

import org.example.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author Hcs
 * @Date 2021-7-2 16:07
 * @Version 1.0
 */
public class MyBean implements FactoryBean<Course> {

    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseName("spring5框架");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}