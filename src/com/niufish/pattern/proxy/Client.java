/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.proxy
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.proxy;

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
        Subject shaobing = new Proxy();
        System.out.println(shaobing.request());
    }
}
