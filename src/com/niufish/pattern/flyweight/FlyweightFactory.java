/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.flyweight
 * 
 * �ļ����� FlyweightFactory.java
 * 
 */
package com.niufish.pattern.flyweight;

import java.util.HashMap;

/**
 * ��Ԫ������ɫ�����𴴽��͹�����Ԫ��ɫ��
 * <p>
 * <a href="FlyweightFactory.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class FlyweightFactory {
    
    /**
     * ���е���Ԫ����
     */
    private HashMap _flies = new HashMap();
    
    /**
     * �õ���Ԫ�������ԭ�ȳ�ʼ����ֱ�Ӵ�_flies����õ�
     * @param createWhichClass ��Ҫ�����Ķ��������
     * @return ��Ԫ����
     * @throws ClassNotFoundException ��û�ҵ��쳣
     * @throws IllegalAccessException �����쳣
     * @throws InstantiationException  ��ʼ���쳣
     */
    public Flyweight getFlyweight(String createWhichClass) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
        if (_flies.containsKey(createWhichClass)){
            return (Flyweight)_flies.get(createWhichClass);
        }else{
            Flyweight fly = null;
            fly = (Flyweight)Class.forName(createWhichClass).newInstance();
            _flies.put(createWhichClass,fly);
            return fly;
        }
    }
    

}
