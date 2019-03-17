package com.principle.singleresponsibility;

/**
 * @author lihaocheng
 * @create 2019-03-17 11:44
 **/

public interface ICourse {

    //课程信息
    String getCourseName();
    byte[] getCourseVideo();

    //课程管理
    void studyCourse();
    void refundCourse();

    //依据单一职责原则将两者拆分成两个接口

}
