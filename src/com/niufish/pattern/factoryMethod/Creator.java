/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.factoryMethod
 * 
 * �ļ����� Creator.java
 * 
 */
package com.niufish.pattern.factoryMethod;

/**
 * ���󹤳����κ���ģʽ�д����Ĺ��������ʵ������ӿ�
 * <p>
 * <a href="Creator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Creator {
    
    /**
     * ��������
     * @return ����Ĳ�Ʒ
     */
    Product FactoryMethod();

}
