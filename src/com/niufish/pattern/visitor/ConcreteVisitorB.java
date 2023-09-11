/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.visitor
 * 
 * �ļ����� ConcreteVisitorB.java
 * 
 */
package com.niufish.pattern.visitor;

/**
 * ���������B��ɫ
 * <p>
 * <a href="ConcreteVisitorB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteVisitorB implements Visitor {

    /**
     * @see com.niufish.pattern.visitor.Visitor#visit(com.niufish.pattern.visitor.ConcreteElementA)
     */
    public void visit(ConcreteElementA cea) {
        System.out.println(cea.operationA());
    }

    /**
     * @see com.niufish.pattern.visitor.Visitor#visit(com.niufish.pattern.visitor.ConcreteElementB)
     */
    public void visit(ConcreteElementB ceb) {
        System.out.println(ceb.operationB());
    }

}
