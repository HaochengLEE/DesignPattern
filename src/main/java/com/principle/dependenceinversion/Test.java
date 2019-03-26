package com.principle.dependenceinversion;

/**
 * @author lihaocheng
 * @create 2019-03-16 15:32
 **/

public class Test {
//    v1.0
//    public static void main(String[] args) {
//        Watson watson=new Watson();
//        watson.studyJava();
//        watson.studyPython();
//        watson.studyScala();
//    }

//    v2.0
//    public static void main(String[] args) {
//        Watson watson=new Watson();
//        watson.studyCourse(new JavaCourseFactory());
//        watson.studyCourse(new PythonCourse());
//
//    }

//    v3.0
//    public static void main(String[] args) {
//        Watson watson=new Watson(new JavaCourseFactory());
//        watson.studyCourse();
//        Watson watson1=new Watson(new PythonCourse());
//        watson1.studyCourse();
//
//
//    }
//    v4.0
    public static void main(String[] args) {
        Watson watson=new Watson();
        watson.setiCourse(new JavaCourse());
        watson.studyCourse();
        watson.setiCourse(new PythonCourse());
        watson.studyCourse();

    }
}
