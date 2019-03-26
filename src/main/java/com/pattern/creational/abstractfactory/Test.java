package com.pattern.creational.abstractfactory;

/**
 * @author lihaocheng
 * @create 2019-03-26 22:35
 **/

public class Test {
    public static void main(String[] args) {
        CourseFactory javacourse=new JavaCourseFactory();
        CourseFactory pythoncourse=new PythonCourseFactory();
        Article article1=javacourse.getArticle();
        Article article2=pythoncourse.getArticle();
        Video video1=javacourse.getVideo();
        Video video2=pythoncourse.getVideo();

        article1.produce();
        article2.produce();
        video1.produce();
        video2.produce();

    }

}
