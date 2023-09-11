/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.interpreter
 * 
 * �ļ����� AbstractExpression.java
 * 
 */
package com.niufish.pattern.interpreter;

/**
 * ������ʽ��ɫ
 * <p>
 * <a href="AbstractExpression.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface AbstractExpression {
    
    /**
     * ���Ͳ���
     * @param c
     */
    void interpret(Context c);

}
