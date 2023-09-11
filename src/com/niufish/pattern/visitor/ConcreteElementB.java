/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.visitor
 * 
 * �ļ����� ConcreteElementB.java
 * 
 */
package com.niufish.pattern.visitor;

/**
 * ����Ԫ��B
 * <p>
 * <a href="ConcreteElementB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteElementB implements Element {

    /**
     * @see com.niufish.pattern.visitor.Element#accept(com.niufish.pattern.visitor.Visitor)
     */
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    /**
     * ���еķ���
     * @return һ�ַ���
     */
    public String operationB(){
        return "operation from B";
    }

}
