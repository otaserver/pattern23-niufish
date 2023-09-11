/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.abstractFactory
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.abstractFactory;

/**
 * 测试类
 * <p>
 * <a href="Client.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory1();
        System.out.println(factory.createProductA().toString());
        System.out.println(factory.createProductB().toString());
        factory = new ConcreteFactory2();
        System.out.println(factory.createProductA().toString());
        System.out.println(factory.createProductB().toString());
    }
}
