package com.pattern.actional.state;

/**
 * @author lihaocheng
 * @createtime 2022/7/23
 */
public class QcState implements BaseState{
    private static int NUM=0;
    private Bill bill;

    public QcState(Bill bill) {
        this.bill = bill;
    }

    @Override
    public State getName() {
        return State.QC;
    }

    @Override
    public void next() {
        //测试结果，这里默认为ture
        Boolean result = test();
        if(result){
            System.out.println("QC测试通过，转交到完成");
            bill.setState(new FinishedState(bill));
        }else {
            System.out.println("QC测试未通过，转交到修理");
            bill.setState(new RepairState(bill));
        }
    }

    /**
     * 测试方法
     * @return
     */
    private boolean test(){
        if (0==NUM){
            NUM=1;
            return false;
        }else {
            return true;
        }
    }
}
