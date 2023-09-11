/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.chainOfResponsibility
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.chainOfResponsibility;

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
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}
