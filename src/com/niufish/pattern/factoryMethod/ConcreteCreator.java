/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.factoryMethod
 * 
 * �ļ����� ConcreteCreator.java
 * 
 */
package com.niufish.pattern.factoryMethod;

/**
 * ���幤���������а�����Ӧ��������ص��߼��������ܵ�Ӧ�ó���ĵ����Դ�����Ʒ����
 * <p>
 * <a href="ConcreteCreator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteCreator implements Creator {

    /**
     * @see com.niufish.pattern.factoryMethod.Creator#FactoryMethod()
     */
    public Product FactoryMethod() {
        return new ConcreteProduct();
    }

}
