/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.singleton
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.singleton;

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
        Singleton s1 = Singleton.getInstance();
        line();
        RegSingleton s2 = RegSingleton.getInstance(null);
        line();
        RegSingletonChild s3 = RegSingletonChild.getInstance();
        line();
        RegSingletonChild s4 = RegSingletonChild.getInstance();
        line();
    }

    /**
     * ������
     */
    private static void line() {
        System.out.println("-------------------");
    }
}
