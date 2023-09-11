/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.observer
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.observer;

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
        ConcreteSubject cs = new ConcreteSubject();
        ConcreteObserver co = new ConcreteObserver(cs);
        cs.setData("hello");
    }
}
