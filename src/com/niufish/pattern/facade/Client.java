/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.facade
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.facade;

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
        Facade f = new Facade();
        f.OperationWrapper();
    }
}
