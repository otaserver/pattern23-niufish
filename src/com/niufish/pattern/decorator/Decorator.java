/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.decorator
 * 
 * �ļ����� Decorator.java
 * 
 */
package com.niufish.pattern.decorator;

/**
 * װ����
 * <p>
 * <a href="Decorator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Decorator implements Component {
    
    /**
     * һ����ŵ�����
     */
    private Component myComp;
    
    /**
     * @param myC ��װ���Component����
     */
    public Decorator(Component myC){
        myComp = myC;
    }
    
    /**
     * @see com.niufish.pattern.decorator.Component#operation()
     */
    public void operation() {
        if (myComp!=null) myComp.operation();
    }

}
