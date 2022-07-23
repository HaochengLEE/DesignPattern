package com.pattern.actional.state;

/**
 * @author lihaocheng
 * @createtime 2022/7/23
 */
public class RepairState implements BaseState{
    private Bill bill;

    public RepairState(Bill bill) {
        this.bill = bill;
    }

    @Override
    public State getName() {
        return State.QC;
    }

    @Override
    public void next() {
        System.out.println("修理完成，转交QC测试");
        bill.setState(new QcState(bill));
    }
}
