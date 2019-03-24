package com.pattern.creational.simplefactory;

/**
 * @author lihaocheng
 * @create 2019-03-24 14:05
 **/

public class Test {
//    public static void main(String[] args) {
//        VideoFactory videoFactory=new VideoFactory();
//        Video java=videoFactory.getVideo("java");
//        if (java==null){
//            return;
//        }
//        java.produce();
//    }
    public static void main(String[] args) {
        VideoFactory videoFactory=new VideoFactory();
        Video video=videoFactory.getVideo2(JavaVideo.class);

    }

}
