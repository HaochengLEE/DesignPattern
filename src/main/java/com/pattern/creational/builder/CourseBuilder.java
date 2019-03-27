package com.pattern.creational.builder;

/**
 * @author lihaocheng
 * @create 2019-03-27 22:36
 **/

public abstract class CourseBuilder {
    public abstract void builderCourseName(String courseName);
    public abstract void builderCoursePrice(String coursePrice);
    public abstract void builderCourseVideo(String courseVideo);
    public abstract void builderCourseArticle(String courseArticle);
    public abstract void builderCoursePPT(String coursePPT);
    public abstract Course makeCourse();

}
