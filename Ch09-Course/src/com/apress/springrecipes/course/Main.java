package com.apress.springrecipes.course;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-hibernate.xml");
           // new ClassPathXmlApplicationContext("beans-jpa.xml");

        CourseDao courseDao = (CourseDao) context.getBean("courseDao");

        Course course = new Course();
        course.setTitle("Spring Recipes 2.5");
        course.setBeginDate(new GregorianCalendar(2009, 8, 1).getTime());
        course.setEndDate(new GregorianCalendar(2010, 9, 1).getTime());
        course.setFee(3000);
        courseDao.store(course);

        List<Course> courses = courseDao.findAll();
        Long courseId = courses.get(0).getId();

        course = courseDao.findById(courseId);
        System.out.println("Course Title: " + course.getTitle());
        System.out.println("Begin Date: " + course.getBeginDate());
        System.out.println("End Date: " + course.getEndDate());
        System.out.println("Fee: " + course.getFee());

        //courseDao.delete(courseId);
    }
}
