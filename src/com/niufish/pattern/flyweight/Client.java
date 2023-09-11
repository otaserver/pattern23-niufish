/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.flyweight
 * 
 * 文件名称 Client.java
 * 
 */
package com.niufish.pattern.flyweight;

/**
 * 测试类
 * <p>
 * <a href="Client.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.getFlyweight("com.niufish.pattern.flyweight.ConcreteFlyweight");
        fly.operation("nihao");
        fly.operation("hello");
        Flyweight fly2 = factory.getFlyweight("com.niufish.pattern.flyweight.ConcreteFlyweight");
        fly.operation("yaligaidougoudoyimasi");
        fly.operation("bengru");
    }
}
