/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.decorator
 * 
 * �ļ����� ConcreteComponent.java
 * 
 */
package com.niufish.pattern.decorator;

/**
 * ʵ�־��幦�ܵ�����
 * <p>
 * <a href="ConcreteComponent.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteComponent implements Component {

    /**
     * @see com.niufish.pattern.decorator.Component#operation()
     */
    public void operation() {
        System.out.println("ConcreteComponent");
    }

}
