/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.bridge
 * 
 * �ļ����� Abstraction.java
 * 
 */
package com.niufish.pattern.bridge;

/**
 * �Գ����������壬������ʵ�ֵ�����
 * <p>
 * <a href="Abstraction.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Abstraction {
    
    /**
     * ʵ��
     */
    private Implementor _imp = null;
    
    /**
     * ��ʵ�ֹҹ�
     * @param imp
     */
    public Abstraction(Implementor imp){
        _imp = imp;
    }
    
    protected void print(String str){
        _imp.operationImp(str);
    }
    
    /**
     * ����
     */
    public abstract void operation();
}
