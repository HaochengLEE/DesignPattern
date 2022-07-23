package com.pattern.actional.state;

import lombok.Data;

/**
 * @author lihaocheng
 * @createtime 2022/7/23
 */
public class Bill {

    /**
     * 状态
     */
    private BaseState state;

    public Bill() {
        this.state=new RepairState(this);
    }

    public void next(){
        this.state.next();
    }

    public BaseState getState() {
        return state;
    }

    public void setState(BaseState state) {
        this.state = state;
    }
}
