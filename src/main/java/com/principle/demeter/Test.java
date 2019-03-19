package com.principle.demeter;

/**
 * @author lihaocheng
 * @create 2019-03-19 10:40
 **/

public class Test {
    public static void main(String[] args) {
        President president  =   new President();
        General general      =   new General();
        Captain captain      =   new Captain();
        president.commandCheck(general,captain);

    }

}
