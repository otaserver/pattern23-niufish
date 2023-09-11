/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.state
 * 
 * �ļ����� ConcreteStateA.java
 * 
 */
package com.niufish.pattern.state;

/**
 * ����״̬��ɫ<br />
 * �˴�Ϊ�ܵ�״̬
 * <p>
 * <a href="ConcreteStateA.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteStateA implements State {

    /**
     * @see com.niufish.pattern.state.State#Handle()
     */
    public void Handle() {
        System.out.println("��������");
    }

}
