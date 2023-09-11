/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.visitor
 * 
 * �ļ����� Element.java
 * 
 */
package com.niufish.pattern.visitor;

/**
 * ����Ԫ�ؽ�ɫ
 * <p>
 * <a href="Element.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Element {
    
    /**
     * ���ܷ����ߵķ���
     * @param visitor ������
     */
    void accept(Visitor visitor);

}
