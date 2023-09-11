/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.iterator
 * 
 * �ļ����� Aggregate.java
 * 
 */
package com.niufish.pattern.iterator;

/**
 * �ۼ���ɫ
 * <p>
 * <a href="Aggregate.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Aggregate {
    
    /**
     * �������������������ӵĽӿ�
     * @return ������
     */
    Iterator createIterator();
    
}
