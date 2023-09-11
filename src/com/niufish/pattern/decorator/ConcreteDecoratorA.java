/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.decorator
 * 
 * �ļ����� ConcreteDecoratorA.java
 * 
 */
package com.niufish.pattern.decorator;

/**
 * ��ConcreteComponent��֮ǰ��չ���ܵ���A
 * <p>
 * <a href="ConcreteDecoratorA.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteDecoratorA extends Decorator {

    /**
     * @param myC ��װ���Component����
     */
    public ConcreteDecoratorA(Component myC) {
        super(myC);
    }

    /**
     * ����Լ��Ĳ�������������
     * @see com.niufish.pattern.decorator.Component#operation()
     */
    public void operation(){
        System.out.println("ConcreteDecoratorA");
        super.operation();
    }

}
