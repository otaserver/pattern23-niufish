/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.command
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.command;

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
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
