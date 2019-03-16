package com.principle.dependenceinversion;

/**
 * @author lihaocheng
 * @create 2019-03-16 12:33
 **/

public class Watson {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }


    public void studyCourse(){
       iCourse.study();

   }


}
