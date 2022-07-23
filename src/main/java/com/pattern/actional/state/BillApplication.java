package com.pattern.actional.state;

/**
 * @author lihaocheng
 * @createtime 2022/7/23
 */
public class BillApplication {
    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.next();
        bill.next();
        bill.next();
        bill.next();
        bill.next();
    }
}
