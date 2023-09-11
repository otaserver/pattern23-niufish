/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.singleton
 * 
 * �ļ����� RegSingletonChild.java
 * 
 */
package com.niufish.pattern.singleton;

/**
 * �ɼ̳е���������
 * <p>
 * <a href="RegSingletonChild.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class RegSingletonChild extends RegSingleton {
    
    public RegSingletonChild(){
        System.out.println("RegSingletonChild initialized");
    }
    
    /**
     * ��̬�������������ش����Ψһʵ��
     * @return �Լ�
     */
    static public RegSingletonChild getInstance(){
        return (RegSingletonChild)RegSingleton.getInstance("com.niufish.pattern.singleton.RegSingletonChild");
    }
    
}
