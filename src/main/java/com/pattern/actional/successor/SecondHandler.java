package com.pattern.actional.successor;

/**
 * @author lihaocheng
 * @createtime 2022/7/21
 */
public class SecondHandler extends AbstractHandler{

    @Override
    protected boolean doHandler() {
        boolean success = false;
        System.out.println("2 在处理");
        return success;
    }
}
