package com.pattern.actional.successor;

/**
 * @author lihaocheng
 * @createtime 2022/7/21
 */
public class FirstHandler extends AbstractHandler{
    @Override
    protected boolean doHandler() {
        boolean handled = true;
        System.out.println("1 在处理");
        //...
        return handled;
    }

}
