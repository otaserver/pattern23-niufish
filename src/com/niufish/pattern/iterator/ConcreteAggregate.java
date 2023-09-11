/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.iterator
 * 
 * �ļ����� ConcreteAggregate.java
 * 
 */
package com.niufish.pattern.iterator;

/**
 * ����ۼ���ɫ
 * <p>
 * <a href="ConcreteAggregate.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteAggregate implements Aggregate {
    
    /**
     * ���е��������
     */
    private Object[] _objs = {"kingfish","niuniu","99"};
    
    /**
     * @see com.niufish.pattern.iterator.Aggregate#createIterator()
     */
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    
    /**
     * �ṩ�ۼ�Ԫ��
     * @param idx λ��
     * @return ��λ���ϵĶ���
     */
    public Object getElement(int idx){
        if (idx < _objs.length)
            return _objs[idx];
        else
            return null;
    }
    
    /**
     * @return �ۼ��Ĵ�С
     */
    public int size(){
        return _objs.length;
    }

}
