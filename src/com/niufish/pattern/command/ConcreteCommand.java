/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.command
 * 
 * �ļ����� ConcreteCommand.java
 * 
 */
package com.niufish.pattern.command;

/**
 * ���������ɫ������һ�������ߺ���Ϊ֮�������ϣ�ʵ��execute������������ý����ߵ���Ӧ������
 * <p>
 * <a href="ConcreteCommand.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteCommand implements Command {
    
    /**
     * ���еĽ����߶���
     */
    private Receiver _receiver;
    
    /**
     * ��ʼ�����еĽ����߶���
     * @param receiver �����߶���
     */
    public ConcreteCommand(Receiver receiver){
        _receiver = receiver;
    }
    /**
     * @see com.niufish.pattern.command.Command#execute()
     */
    public void execute() {
        _receiver.action();
    }
    
    /**
     * @see com.niufish.pattern.command.Command#unexecute()
     */
    public void unexecute() {
    }

}
