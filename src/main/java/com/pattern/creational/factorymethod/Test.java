package com.pattern.creational.factorymethod;

/**
 * @author lihaocheng
 * @create 2019-03-24 14:05
 **/

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory=new JavaVideoFactory();
        VideoFactory videoFactory1=new PythonVideoFactory();

        Video video=videoFactory.create();
        Video video1=videoFactory1.create();

        video.produce();
        video1.produce();



    }

}

