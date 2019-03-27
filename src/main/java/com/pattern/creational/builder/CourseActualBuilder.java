package com.pattern.creational.builder;

/**
 * @author lihaocheng
 * @create 2019-03-27 22:39
 **/

public class CourseActualBuilder extends CourseBuilder {

    private Course course=new Course();
    public void builderCourseName(String courseName) {
        course.setCourseName(courseName);

    }

    public void builderCoursePrice(String coursePrice) {
        course.setCoursePrice(coursePrice);

    }

    public void builderCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);

    }

    public void builderCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);

    }

    public void builderCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);

    }

    public Course makeCourse() {
        return course;
    }
}
