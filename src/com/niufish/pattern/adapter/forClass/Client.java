/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.adapter.forClass
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.adapter.forClass;

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
        Target t = new Adapter();
        t.request();
    }
}
