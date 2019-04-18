package com.nice.simple.demo;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
          Arrays.asList("a","b","d").sort((e1,e2) -> {
            int result = e1.compareTo(e2);
            System.out.println(result);
            return result;
        });
    }
}
