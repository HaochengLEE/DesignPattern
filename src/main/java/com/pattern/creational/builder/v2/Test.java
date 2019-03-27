package com.pattern.creational.builder.v2;

/**
 * @author lihaocheng
 * @create 2019-03-27 23:30
 **/

public class Test {
    public static void main(String[] args) {
        Course course=new Course.CourseBuilder().builderCourseName("Java").builderCoursePrice("127").build();
        System.out.println(course);
    }

}
