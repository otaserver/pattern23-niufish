/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.mediator
 * 
 * �ļ����� Colleague.java
 * 
 */
package com.niufish.pattern.mediator;

/**
 * ����ͬ�½�ɫ���˶���ֻ֪����ͣ�߶���֪������ͬ�¶���
 * <p>
 * <a href="Colleague.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class Colleague {
    
    /**
     * ���еĵ�ͣ�߶���
     */
    private Mediator _mediator;
    
    /**
     * ��ʼ�����еĵ�ͣ�߶���
     * @param med
     */
    public Colleague(Mediator med){
        _mediator = med;
    }
    
    /**
     * �õ���ͣ��
     * @return ��ͣ��
     */
    public Mediator getMediator(){
        return _mediator;
    }
    
    /**
     * ������������ʵ��
     */
    public abstract void action();
    
    /**
     * ʾ��ķ���<br />
     * �ı������ڲ�״̬
     */
    public void change(){
        if (_mediator!=null)
            _mediator.doSomething();
    }

}
