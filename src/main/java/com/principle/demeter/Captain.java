package com.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaocheng
 * @create 2019-03-19 10:31
 **/

public class Captain {
    public void checkSoldier(){
        List<Soldier> soldiers=new ArrayList<Soldier>();
        for(int i=0;i<10;i++){
            soldiers.add(new Soldier());

        }
        System.out.println("there is "+soldiers.size()+" soliders");

    }

}
