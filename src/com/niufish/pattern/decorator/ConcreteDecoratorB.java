/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.decorator
 * 
 * �ļ����� ConcreteDecoratorB.java
 * 
 */
package com.niufish.pattern.decorator;

/**
 * ��ConcreteComponent��֮����չ���ܵ���B
 * <p>
 * <a href="ConcreteDecoratorB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteDecoratorB extends Decorator {

    /**
     * @param myC ��װ���Component����
     */
    public ConcreteDecoratorB(Component myC) {
        super(myC);
    }

    /**
     * ����������������������Լ��Ĳ���
     * @see com.niufish.pattern.decorator.Component#operation()
     */
    public void operation(){
        super.operation();
        System.out.println("ConcreteDecoratorB");
    }

}
