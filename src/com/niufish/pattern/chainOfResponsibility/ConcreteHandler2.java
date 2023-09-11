/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.chainOfResponsibility
 * 
 * �ļ����� ConcreteHandler2.java
 * 
 */
package com.niufish.pattern.chainOfResponsibility;

/**
 * ���崦����2
 * <p>
 * <a href="ConcreteHandler2.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteHandler2 extends Handler {

    /**
     * @see com.niufish.pattern.chainOfResponsibility.Handler#handleRequest()
     */
    public void handleRequest() {
        if (getSuccessor()!=null){
            System.out.println("ConcreteHandler2���¼���:"+getSuccessor());
            getSuccessor().handleRequest();
        }else{
            System.out.println("ConcreteHandler2������");
        }
    }
    
    public String toString(){
        return "ConcreteHandler2";
    }
}
