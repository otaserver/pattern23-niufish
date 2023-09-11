/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.mediator
 * 
 * �ļ����� ConcreteColleague2.java
 * 
 */
package com.niufish.pattern.mediator;

/**
 * �����ͬ����2
 * <p>
 * <a href="ConcreteColleague2.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteColleague2 extends Colleague {

    /**
     * @param med ��ͣ��
     */
    public ConcreteColleague2(Mediator med) {
        super(med);
    }

    /**
     * @see com.niufish.pattern.mediator.Colleague#action()
     */
    public void action() {
        System.out.println("hello from Colleague2");
    }

}
