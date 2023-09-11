/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.singleton
 * 
 * �ļ����� Singleton.java
 * 
 */
package com.niufish.pattern.singleton;

/**
 * �̰߳�ȫ�ĵ���
 * <p>
 * <a href="Singleton.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Singleton {
    
    /**
     * ���е��Լ�
     */
    private static Singleton _uniqueInstance = null;
    
    /**
     * ˽�й����ӣ���֤����޷�ֱ��ʵ����
     */
    private Singleton(){
        System.out.println("Singleton initialized");
    }
    
    /**
     * ��̬�������������ش����Ψһʵ��
     * @return �Լ�
     */
    synchronized public static Singleton getInstance(){
        if (_uniqueInstance==null){
            _uniqueInstance = new Singleton();
        }
        return _uniqueInstance;
    }
}
