package com.nice.inter.demo;

public class OverridableImpl implements  Defaulable {
    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}
