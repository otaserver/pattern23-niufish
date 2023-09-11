/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.flyweight
 * 
 * �ļ����� ConcreteFlyweight.java
 * 
 */
package com.niufish.pattern.flyweight;

/**
 * ������Ԫ��ɫ
 * <p>
 * <a href="ConcreteFlyweight.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteFlyweight extends Flyweight {
    
    /**
     * �������
     */
    private String _intrinsicState = "�����Ķ���";
    
    /**
     * �����ʱ��������ʾ
     */
    public ConcreteFlyweight(){
        System.out.println("ConcreteFlyweight init");
    }
    /**
     * @see com.niufish.pattern.flyweight.Flyweight#operation(java.lang.String)
     */
    public void operation(String extrinsicState) {
        System.out.println("ConcreteFlyweight:����["+_intrinsicState+"] ����["+extrinsicState+"]");
    }

}
