/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.interpreter
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.interpreter;

/**
 * ������
 * <p>
 * <a href="Client.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Context c = new Context();
        AbstractExpression ae = new NonterminalExpression(new TerminalExpression("hello my friend!"),2);
        ae.interpret(c);
    }
}
