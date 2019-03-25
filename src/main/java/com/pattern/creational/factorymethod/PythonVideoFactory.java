package com.pattern.creational.factorymethod;

/**
 * @author lihaocheng
 * @create 2019-03-25 21:39
 **/

public class PythonVideoFactory extends VideoFactory {

    public Video create() {
        return new PythonVideo();
    }
}
