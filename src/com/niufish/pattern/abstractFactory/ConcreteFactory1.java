/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.abstractFactory
 * 
 * �ļ����� ConcreteFactory1.java
 * 
 */
package com.niufish.pattern.abstractFactory;

/**
 * ����ɫֱ���ڿͻ��˵ĵ����´�����Ʒ��ʵ����
 * �����ɫ����ѡ����ʵĲ�Ʒ������߼���
 * ������߼�����Ӧ��ϵͳ����ҵ�߼�������صġ�
 * <p>
 * <a href="ConcreteFactory1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteFactory1 implements AbstractFactory {

    /**
     * @see com.niufish.pattern.abstractFactory.AbstractFactory#createProductA()
     */
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    /**
     * @see com.niufish.pattern.abstractFactory.AbstractFactory#createProductB()
     */
    public AbstractProductB createProductB() {
        return new ProductB1();
    }

}
