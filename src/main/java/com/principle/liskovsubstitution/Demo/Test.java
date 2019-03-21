package com.principle.liskovsubstitution.Demo;

import java.util.HashMap;

/**
 * @author lihaocheng
 * @create 2019-03-21 17:28
 **/

public class Test {
    public static void main(String[] args) {
        Child child=new Child();
        HashMap hashMap=new HashMap();
        child.method(hashMap);
    }

}
