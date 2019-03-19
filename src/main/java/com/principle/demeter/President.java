package com.principle.demeter;

/**
 * @author lihaocheng
 * @create 2019-03-19 10:27
 **/

public class President {
    public void commandCheck(General general,Captain captain){
        general.callCaptain(captain);

    }

}
