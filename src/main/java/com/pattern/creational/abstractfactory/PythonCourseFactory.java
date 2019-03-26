package com.pattern.creational.abstractfactory;

/**
 * @author lihaocheng
 * @create 2019-03-26 22:44
 **/

public class PythonCourseFactory implements CourseFactory{
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }

}
