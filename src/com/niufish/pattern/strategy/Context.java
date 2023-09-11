/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.strategy
 * 
 * �ļ����� Context.java
 * 
 */
package com.niufish.pattern.strategy;

/**
 * ������ɫ������һ��Strategy������
 * <p>
 * <a href="Context.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Context {
    
    /**
     * ���еĲ��Զ���
     */
    private Strategy _strategy;
    
    /**
     * ���ڳ�ʼ�����еĶ���
     * @param strategy ʵ�����Ĳ��Զ���
     */
    public Context(Strategy strategy){
        _strategy = strategy;
    }
    
    /**
     * ���ó��еĶ���
     * @param _strategy ʵ�����Ĳ��Զ���
     */
    public void setStrategy(Strategy _strategy) {
        this._strategy = _strategy;
    }

    /**
     * ���Է���
     */
    public void contextInterface(){
        _strategy.algorithmInterface();
    }
    
}
