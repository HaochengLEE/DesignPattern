package com.pattern.actional.state;

/**
 * @author lihaocheng
 * @createtime 2022/7/23
 */
public class FinishedState implements BaseState{
    private Bill bill;
    @Override
    public State getName() {
        return State.FINISHED;
    }

    @Override
    public void next() {
        System.out.println("完成修理");
    }

    public FinishedState(Bill bill) {
        this.bill = bill;
    }
}
