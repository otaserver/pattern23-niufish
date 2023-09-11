/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.state
 * 
 * �ļ����� ConcreteStateB.java
 * 
 */
package com.niufish.pattern.state;

/**
 * ����״̬��ɫ<br />
 * �˴�Ϊ�ߵ�״̬
 * <p>
 * <a href="ConcreteStateB.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteStateB implements State {

    /**
     * @see com.niufish.pattern.state.State#Handle()
     */
    public void Handle() {
        System.out.println("��������");
    }

}
