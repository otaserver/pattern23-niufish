/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.memento
 * 
 * �ļ����� Originator.java
 * 
 */
package com.niufish.pattern.memento;

/**
 * �����˽�ɫ������һ�����е�ǰ���ڲ�״̬�ı���¼����ʹ�ñ���¼����洢���ڲ�״̬��
 * <p>
 * <a href="Originator.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Originator {
    
    /**
     * ״̬
     */
    private String _state;
    
    /**
     * ��������������һ���µı���¼����
     * @return �µı���¼����
     */
    public Memento createMemento(){
        return new Memento(_state);
    }
    
    /**
     * �ָ�������¼���������ص�״̬
     * @param memento ����״̬�ı���¼����
     */
    public void restoreMemento(MementoIF memento){
        _state = ((Memento)memento).getState();
    }

    public String getState() {
        return _state;
    }
    
    public void setState(String _state) {
        this._state = _state;
        System.out.println("current state:"+_state);
    }
    
    protected class Memento implements MementoIF{
        
        /**
         * �����״̬
         */
        private String _savedState;
        
        /**
         * ���淢���˵�״̬
         * @param someState �����˵�״̬
         */
        private Memento(String someState){
            _savedState = someState;
        }
        
        /**
         * ״̬ȡֵ
         */
        public String getState() {
            return _savedState;
        }
        
        /**
         * ״̬��ֵ 
         * @param _state ״̬
         */
        public void setState(String _state) {
            this._savedState = _state;
        }
    }
}
