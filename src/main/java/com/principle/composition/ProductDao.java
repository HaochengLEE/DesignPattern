package com.principle.composition;

/**
 * @author lihaocheng
 * @create 2019-03-23 11:04
 **/

public class ProductDao {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void Connection(){
        System.out.println(dbConnection.getConnection());
    }






}
