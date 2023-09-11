/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.adapter.forObject
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.adapter.forObject;

import com.niufish.pattern.adapter.forClass.Adaptee;
import com.niufish.pattern.adapter.forClass.Target;

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
        Target t = new Adapter(new Adaptee());
        t.request();
    }
}
