/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.interpreter
 * 
 * �ļ����� NonterminalExpression.java
 * 
 */
package com.niufish.pattern.interpreter;

/**
 * ���ս���ʽ��ɫ<br />
 * �˴�Ϊѭ�����
 * <p>
 * <a href="NonterminalExpression.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class NonterminalExpression implements AbstractExpression {
    
    /**
     * ���еı��ʽ
     */
    private AbstractExpression _expression;
    
    /**
     * ѭ���Ĵ���
     */
    private int _times = 0;
    
    /**
     * ��ʼ�����ж��󣬲���ȷѭ������
     * @param exp ���ʽ����
     * @param times ѭ���Ĵ���
     */
    public NonterminalExpression(AbstractExpression exp,int times){
        _expression = exp;
        _times = times;
    }
    
    /**
     * @see com.niufish.pattern.interpreter.AbstractExpression#interpret(com.niufish.pattern.interpreter.Context)
     */
    public void interpret(Context c) {
        for (int i=0;i<_times;i++){
            _expression.interpret(c);
        }
    }

}
