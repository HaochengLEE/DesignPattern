package com.pattern.creational.builder;

/**
 * @author lihaocheng
 * @create 2019-03-27 22:32
 **/

public class Course {
    private String courseName;
    private String coursePrice;
    private String courseVideo;
    private String courseArticle;
    private String coursePPT;

    @Override
    public String toString() {
        return "name:"+courseName+"price:"+coursePrice+"video"+courseVideo+"article"+courseArticle+"ppt"+coursePPT;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }
}
