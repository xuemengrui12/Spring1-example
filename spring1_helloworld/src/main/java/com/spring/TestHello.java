package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author xmr
 * Date:  2019-02-21
 * helloworld
 */
public class TestHello {
    public static void main(String[] args) {
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("/helloworld.xml");
        //2、从容器中获取Bean，注意此处完全“面向接口编程，而不是面向实现”
        //HelloApi helloApi = context.getBean("hello", HelloApi.class);
        HelloApi helloApi = context.getBean(HelloApi.class);
        //3、执行业务逻辑
        helloApi.sayHello();
    }
}
