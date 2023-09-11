/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.memento
 * 
 * �ļ����� Caretaker.java
 * 
 */
package com.niufish.pattern.memento;

/**
 * �����˽�ɫ�����𱣴汸��¼���󣬲���鱸��¼��������
 * <p>
 * <a href="Caretaker.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Caretaker {
    
    /**
     * ���еı���¼����
     */
    private MementoIF _memento;
    
    /**
     * @return ��صı���¼
     */
    public MementoIF retrieveMemento(){
        return _memento;
    }
    
    /**
     * ���汸��¼����
     * @param memento ����¼����
     */
    public void saveMemento(MementoIF memento){
        _memento = memento;
    }
}
