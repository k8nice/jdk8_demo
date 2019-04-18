package com.nice.inter.demo;

public interface Defaulable {
    default String notRequired(){
        return "Default implementation";
    }
}
