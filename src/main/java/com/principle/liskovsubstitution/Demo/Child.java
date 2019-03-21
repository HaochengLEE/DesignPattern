package com.principle.liskovsubstitution.Demo;

import java.util.Map;

/**
 * @author lihaocheng
 * @create 2019-03-21 17:26
 **/

public class Child  extends Base{
    public void method(Map map){
        System.out.println("Child map is running");
    }

}
