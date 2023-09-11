/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.state
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.state;

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
        Context c = new Context();
        c.setState(new ConcreteStateA());//��ʼ��
        c.request();
        c.setState(new ConcreteStateB());//��ʼ��
        c.request();
    }
}
