package com.pattern.actional.successor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lihaocheng
 * @createtime 2022/7/21
 */
public class HandlerChain {
    private List<AbstractHandler> handlerList = new ArrayList<>();

    public void addHandler(AbstractHandler handler) {
        this.handlerList.add(handler);
    }

    public void handle() {
       for(AbstractHandler handler : handlerList) {
           boolean res=handler.doHandler();
           if (res){
               break;
           }
       }
    }
}
