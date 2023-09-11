/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.flyweight
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.flyweight;

/**
 * ������
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
