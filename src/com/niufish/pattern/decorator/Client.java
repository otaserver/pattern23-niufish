/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.decorator
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.decorator;

/**
 * ������
 * <p>
 * <a href="Client.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Client {
    
    public static void main(String[] args) {
        Component comp = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        comp.operation();
    }
}
