/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.command
 * 
 * �ļ����� Command.java
 * 
 */
package com.niufish.pattern.command;

/**
 * ������һ���������о���������ĳ���ӿ�
 * <p>
 * <a href="Command.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Command {
    
    /**
     * ִ�еĳ���
     */
    void execute();
    
    /**
     * ȡ���ĳ���
     * TODO ���ȡ��ִ�еĴ���
     */
    void unexecute();
    
}
