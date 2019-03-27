package com.pattern.creational.builder;

/**
 * @author lihaocheng
 * @create 2019-03-27 22:58
 **/

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder=new CourseActualBuilder();
        Manager manager=new Manager();
        manager.setCourseBuilder(courseBuilder);
        Course course=manager.makeCourseString("Java","170","4.mp4","1234","2.pptx");
        System.out.println(course.toString());

    }

}
