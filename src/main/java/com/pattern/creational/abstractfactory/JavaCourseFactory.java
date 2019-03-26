package com.pattern.creational.abstractfactory;

/**
 * @author lihaocheng
 * @create 2019-03-26 22:29
 **/

public class JavaCourseFactory implements CourseFactory {

    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
