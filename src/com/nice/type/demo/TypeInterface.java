package com.nice.type.demo;

public class TypeInterface {
    public static void main(String[] args) {
        final Value<String> value = new Value<>();
        value.getOrDefault("22",Value.defaultValue());
        System.out.println(value.getOrDefault("22",Value.defaultValue()));
    }
}
