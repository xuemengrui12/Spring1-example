package com.spring.di;


public class HelloImpl3 implements HelloApi {

    private String message;
    private int index;

    public HelloImpl3() {
        this.message="Hello Spring!";
        this.index=0;
    }

    // @java.beans.ConstructorProperties({"message", "index"})
    public HelloImpl3(String message, int index) {
        this.message = message;
        this.index = index;
    }

    @Override
    public void sayHello() {
        System.out.println(index + ":" + message);
    }
    
}
