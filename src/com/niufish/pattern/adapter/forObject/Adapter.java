/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.adapter.forObject
 * 
 * �ļ����� Adapter.java
 * 
 */
package com.niufish.pattern.adapter.forObject;

import com.niufish.pattern.adapter.forClass.Adaptee;
import com.niufish.pattern.adapter.forClass.Target;

/**
 * ��������ɫ��������������������
 * <p>
 * <a href="Adapter.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Adapter implements Target {
    
    /**
     * ���еĴ��������
     */
    private Adaptee _adaptee;
    
    /**
     * ��ʼ�����е��������
     * @param adaptee �������
     */
    public Adapter(Adaptee adaptee){
        _adaptee = adaptee;
    }
    
    /**
     * @see com.niufish.pattern.adapter.forClass.Target#request()
     */
    public void request() {
        _adaptee.specificRequest();
    }

}
