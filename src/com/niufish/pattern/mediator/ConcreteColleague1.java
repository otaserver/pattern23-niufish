/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.mediator
 * 
 * �ļ����� ConcreteColleague1.java
 * 
 */
package com.niufish.pattern.mediator;

/**
 * �����ͬ����1
 * <p>
 * <a href="ConcreteColleague1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteColleague1 extends Colleague {
    
    private String _helloWords = "happy new year!";

    /**
     * @param med ��ͣ��
     */
    public ConcreteColleague1(Mediator med) {
        super(med);
    }

    /**
     * @see com.niufish.pattern.mediator.Colleague#action()
     */
    public void action() {
        System.out.println(_helloWords+" from Colleague1");
    }

    public void setHelloWords(String helloWords) {
        this._helloWords = helloWords;
    }
}
