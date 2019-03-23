package com.principle.liskovsubstitution.Demo2;

import java.util.HashMap;

/**
 * @author lihaocheng
 * @create 2019-03-21 17:43
 **/

public class Chlid extends Base {

    //子类方法实现父类方法时，返回值要比父类更严格
    public HashMap method() {
        HashMap hashMap=new HashMap();
        System.out.println("child method is running");
        hashMap.put("message","child method is running");
        return hashMap;
    }
}
