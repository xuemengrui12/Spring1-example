package com.spring;

import com.spring.di.HelloApi;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectTest {

    public static void main(String[] args) {
        DependencyInjectTest test=new DependencyInjectTest();
//        test.testConstructorDependencyInject();
        test.testStaticFactoryDependencyInject();
//        test.testInstanceFactoryDependencyInject();
    }
    public void testConstructorDependencyInject() {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/constructorDependencyInject.xml");

        //获取根据空构造器实例化的Bean
        HelloApi helloApi = beanFactory.getBean("bean1", HelloApi.class);
        helloApi.sayHello();

        //获取根据参数索引依赖注入的Bean
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();

        //获取根据参数类型依赖注入的Bean
        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();

        //获取根据参数名字依赖注入的Bean
        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();

    }

    /*静态工厂方法*/
    public void testStaticFactoryDependencyInject() {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/staticFactoryDependencyInject.xml");

        //获取根据参数索引依赖注入的Bean
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();

        //获取根据参数类型依赖注入的Bean
        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();

        //获取根据参数名字依赖注入的Bean
        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();

    }

    /*实例工厂类*/
    public void testInstanceFactoryDependencyInject() {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("/instanceFactoryDependencyInject.xml");

        //获取根据参数索引依赖注入的Bean
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();

        //获取根据参数类型依赖注入的Bean
        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();

        //获取根据参数名字依赖注入的Bean
        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();

    }


}
