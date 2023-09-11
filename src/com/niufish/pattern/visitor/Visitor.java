/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.visitor
 * 
 * �ļ����� Visitor.java
 * 
 */
package com.niufish.pattern.visitor;

/**
 * ��������߽�ɫ������һ���������ʲ���
 * <p>
 * <a href="Visitor.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Visitor {
    
    /**
     * ����ConcreteElementA�ķ��ʲ���
     * @param cea ����Ԫ��
     */
    void visit(ConcreteElementA cea);

    /**
     * ����ConcreteElementB�ķ��ʲ���
     * @param ceb ����Ԫ��
     */
    void visit(ConcreteElementB ceb);

}
