package com.pattern.creational.builder;

/**
 * @author lihaocheng
 * @create 2019-03-27 22:46
 **/

public class Manager {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder=courseBuilder;

    }

    public Course makeCourseString(String courseName,String coursePrice,String courseVideo,String courseArticle,String coursePPT){
        courseBuilder.builderCourseName(courseName);
        courseBuilder.builderCoursePrice(coursePrice);
        courseBuilder.builderCourseArticle(courseArticle);
        courseBuilder.builderCourseVideo(courseVideo);
        courseBuilder.builderCoursePPT(coursePPT);
        return courseBuilder.makeCourse();

    }

}
