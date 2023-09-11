/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.memento
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.memento;

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
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        o.setState("hello");
        c.saveMemento(o.createMemento());
        o.setState("hi");
        o.restoreMemento(c.retrieveMemento());
        System.out.println(o.getState());
    }
}
