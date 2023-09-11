/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.iterator
 * 
 * �ļ����� ConcreteIterator.java
 * 
 */
package com.niufish.pattern.iterator;

/**
 * ��������ӽ�ɫ
 * <p>
 * <a href="ConcreteIterator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteIterator implements Iterator {
    
    /**
     * ���еľ���ۼ�����
     */
    private ConcreteAggregate _cagg;
    
    /**
     * �ۼ�����
     */
    private int _index = 0;
    
    /**
     * ��ʼ������ۼ�����
     * @param cagg ����ۼ�����
     */
    public ConcreteIterator(ConcreteAggregate cagg){
        _cagg = cagg;
    }

    /**
     * @see com.niufish.pattern.iterator.Iterator#first()
     */
    public void first() {
        _index = 0;
    }

    /**
     * @see com.niufish.pattern.iterator.Iterator#next()
     */
    public void next() {
        if (_index < _cagg.size())
            _index++;
    }

    /**
     * @see com.niufish.pattern.iterator.Iterator#isDone()
     */
    public boolean isDone() {
        return (_index >= _cagg.size());
    }

    /**
     * @see com.niufish.pattern.iterator.Iterator#currentItem()
     */
    public Object currentItem() {
        return _cagg.getElement(_index);
    }

}
