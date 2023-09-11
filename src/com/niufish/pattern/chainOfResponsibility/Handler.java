/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.chainOfResponsibility
 * 
 * �ļ����� Handler.java
 * 
 */
package com.niufish.pattern.chainOfResponsibility;

/**
 * �������߽�ɫ
 * <p>
 * <a href="Handler.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Handler {
    
    /**
     * ���е��¼�
     */
    protected Handler _successor;
    
    /**
     * ���ô˷�����������
     */
    public abstract void handleRequest();
    
    /**
     * �����¼�
     * @param successor �¼�
     */
    public void setSuccessor(Handler successor){
        _successor = successor;
    }
    
    /**
     * �õ��¼�
     * @return �¼�
     */
    public Handler getSuccessor(){
        return _successor;
    }
    
}
