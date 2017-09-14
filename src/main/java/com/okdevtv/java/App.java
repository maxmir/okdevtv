package com.okdevtv.java;

/**
 * Hello world!
 *
 */
public class App implements AppInterface {
    private static String msg;

    public static void main(String[] args) {
        msg = "Hello World!";
        print(msg);
    }

    private static void print(String x) {
        System.out.println(x);
    }

    public String getString() {
        // TODO Auto-generated method stub
        return null;
    }
}
