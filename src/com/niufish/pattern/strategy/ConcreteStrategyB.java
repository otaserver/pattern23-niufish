/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.strategy
 * 
 * �ļ����� ConcreteStrategyA.java
 * 
 */
package com.niufish.pattern.strategy;

/**
 * ������Խ�ɫB����װ��ص��㷨����Ϊ
 * <p>
 * <a href="ConcreteStrategyB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteStrategyB implements Strategy {

    /**
     * @see com.niufish.pattern.strategy.Strategy#algorithmInterface()
     */
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyB");
    }

}
