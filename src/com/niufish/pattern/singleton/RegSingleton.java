/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.singleton
 * 
 * �ļ����� RegSingleton.java
 * 
 */
package com.niufish.pattern.singleton;

import java.util.HashMap;

/**
 * �ɼ̳е������������಻�ܹ�ʹ�̰߳�ȫ
 * <p>
 * <a href="RegSingleton.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class RegSingleton {
    
    /**
     * ����ʵ�����˵���
     */
    static private HashMap _registry = new HashMap();
    
    /**
     * �����Ĺ�����
     */
    protected RegSingleton(){ 
        System.out.println("RegSingleton initialized");
    }
    
    /**
     * ��̬�������������ش����Ψһʵ��
     * @param name Ҫ���Ǹ�������
     * @return Ҫ���Ǹ���
     */
    static public RegSingleton getInstance(String name){
        if (name==null){
            return new RegSingleton();
        }
        if (_registry.get(name)==null){
            try{
                _registry.put(name,Class.forName(name).newInstance());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return (RegSingleton)_registry.get(name);
    }
    
}
