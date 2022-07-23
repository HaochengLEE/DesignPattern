package com.pattern.actional.state;

/**
 * * @author lihaocheng
 * * @createTime 2022/7/23
 */
public interface BaseState {
    State getName();
    //以下是定义的事件
    void next();

}
