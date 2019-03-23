package com.principle.composition;

/**
 * @author lihaocheng
 * @create 2019-03-23 11:16
 **/

public class Test {
    public static void main(String[] args) {
        ProductDao productDao=new ProductDao();
        productDao.setDbConnection(new OracalConnection());
        productDao.Connection();
    }

}
