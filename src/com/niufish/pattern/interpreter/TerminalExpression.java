/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.interpreter
 * 
 * �ļ����� TerminalExpression.java
 * 
 */
package com.niufish.pattern.interpreter;

/**
 * �ս���ʽ <br />
 * �˴�Ϊһ�����
 * <p>
 * <a href="TerminalExpression.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class TerminalExpression implements AbstractExpression {
    
    /**
     * ���е����
     */
    private String _statement;
    
    /**
     * ��ʼ�����ж���
     * @param stat �����ַ���
     */
    public TerminalExpression(String stat){
        _statement = stat;
    }

    /**
     * @see com.niufish.pattern.interpreter.AbstractExpression#interpret(com.niufish.pattern.interpreter.Context)
     */
    public void interpret(Context c) {
        System.out.println(_statement);
    }

}
