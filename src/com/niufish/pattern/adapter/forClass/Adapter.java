/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.adapter.forClass
 * 
 * �ļ����� Adapter.java
 * 
 */
package com.niufish.pattern.adapter.forClass;

/**
 * ��������ɫ����ģʽ�ĺ��ġ�
 * <p>
 * <a href="Adapter.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Adapter extends Adaptee implements Target {

    /**
     * �����ķ���
     * @see com.niufish.pattern.adapter.forClass.Target#request()
     */
    public void request() {
        this.specificRequest();
    }

}
