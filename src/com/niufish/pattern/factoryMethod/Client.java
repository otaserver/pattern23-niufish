/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.factoryMethod
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.factoryMethod;

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
        Creator cre1 = new ConcreteCreator();
        Product prod1 = cre1.FactoryMethod();
    }
}
