package com.pattern.creational.builder.v2;

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

    public Course(CourseBuilder courseBuilder) {
        this.courseName=courseBuilder.courseName;
        this.coursePrice=courseBuilder.coursePrice;
        this.coursePrice=courseBuilder.coursePrice;
        this.coursePrice=courseBuilder.coursePrice;
        this.coursePrice=courseBuilder.coursePrice;


    }

    @Override
    public String toString() {
        return "name="+courseName+"price="+coursePrice+"video="+courseVideo+"article="+courseArticle+"ppt="+coursePPT;
    }




    public static class CourseBuilder{
        private String courseName;
        private String coursePrice;
        private String courseVideo;
        private String courseArticle;
        private String coursePPT;


        public CourseBuilder builderCourseName(String courseName) {
            this.courseName=courseName;
            return this;

        }

        public CourseBuilder builderCoursePrice(String coursePrice) {
            this.coursePrice=coursePrice;
            return this;

        }

        public CourseBuilder builderCourseVideo(String courseVideo) {
            this.courseVideo=courseVideo;
            return this;

        }

        public CourseBuilder builderCourseArticle(String courseArticle) {
            this.courseArticle=courseArticle;
            return this;

        }

        public CourseBuilder builderCoursePPT(String coursePPT) {
            this.coursePPT=coursePPT;
            return this;

        }

        public Course build(){
            return new Course(this);

        }

    }
}
