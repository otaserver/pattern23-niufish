/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.chainOfResponsibility
 * 
 * �ļ����� ConcreteHandler1.java
 * 
 */
package com.niufish.pattern.chainOfResponsibility;

/**
 * ���崦����1
 * <p>
 * <a href="ConcreteHandler1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteHandler1 extends Handler {

    /**
     * @see com.niufish.pattern.chainOfResponsibility.Handler#handleRequest()
     */
    public void handleRequest() {
        if (getSuccessor()!=null){
            System.out.println("ConcreteHandler1���¼���:"+getSuccessor());
            getSuccessor().handleRequest();
        }else{
            System.out.println("ConcreteHandler1������");
        }
    }
    
    public String toString(){
        return "ConcreteHandler1";
    }

}
