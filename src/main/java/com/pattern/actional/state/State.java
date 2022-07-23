package com.pattern.actional.state;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author lhc
 */
//@AllArgsConstructor
@Getter
public enum State {

    /**
     *
     */
    REPAIR("维修"),
    QC("测试"),
    FINISHED("完成"),

    ;
    private String name;

    State(String name) {
        this.name = name;
    }
}
