/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.iterator
 * 
 * �ļ����� Iterator.java
 * 
 */
package com.niufish.pattern.iterator;

/**
 * ��������ӽ�ɫ�����������Ԫ������Ҫ�Ľӿ�
 * <p>
 * <a href="Iterator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Iterator {
    
    /**
     * �ƶ�����һ��Ԫ��
     */
    void first();
    
    /**
     * �ƶ�����һ��Ԫ��
     */
    void next();
    
    /**
     * @return �Ƿ������һ��Ԫ��
     */
    boolean isDone();
    
    /**
     * @return ��ǰԪ�� 
     */
    Object currentItem();
    
    

}
