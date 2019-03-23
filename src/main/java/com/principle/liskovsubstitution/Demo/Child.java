package com.principle.liskovsubstitution.Demo;

import java.util.Map;

/**
 * @author lihaocheng
 * @create 2019-03-21 17:26
 **/

public class Child  extends Base{
    //子类重载父类方法时，方法的入参要求要比父类低
    public void method(Map map){
        System.out.println("Child map is running");
    }

}
