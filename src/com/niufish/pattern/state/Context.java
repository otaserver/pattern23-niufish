/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.state
 * 
 * �ļ����� Context.java
 * 
 */
package com.niufish.pattern.state;

/**
 * ������ɫ
 * <p>
 * <a href="Context.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Context {
    
    /**
     * ���е�״̬
     */
    private State _state;
    
    /**
     * ĳЩ����
     */
    public void request(){
        _state.Handle();
    }
    
    /**
     * �ı�״̬
     * @param state ״̬
     */
    public void setState(State state){
        _state = state;
    }

}
