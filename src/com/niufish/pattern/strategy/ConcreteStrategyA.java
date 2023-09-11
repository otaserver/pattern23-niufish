/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.strategy
 * 
 * �ļ����� ConcreteStrategyA.java
 * 
 */
package com.niufish.pattern.strategy;

/**
 * ������Խ�ɫA����װ��ص��㷨����Ϊ
 * <p>
 * <a href="ConcreteStrategyA.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteStrategyA implements Strategy {

    /**
     * @see com.niufish.pattern.strategy.Strategy#algorithmInterface()
     */
    public void algorithmInterface() {
        System.out.println("ConcreteStrategyA");
    }

}
