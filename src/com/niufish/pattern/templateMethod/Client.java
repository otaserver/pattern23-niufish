/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.templateMethod
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.templateMethod;

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
        AbstractClass ac = new ConcreteClass();
        ac.templateMethod();
    }
}
