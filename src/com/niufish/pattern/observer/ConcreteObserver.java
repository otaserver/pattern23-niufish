/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.observer
 * 
 * �ļ����� ConcreteObserver.java
 * 
 */
package com.niufish.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * ����۲���
 * <p>
 * <a href="ConcreteObserver.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteObserver implements Observer {
    
    /**
     * �ͱ����ӵĶ���ҹ�
     * @param cs
     */
    public ConcreteObserver(ConcreteSubject cs){
        cs.addObserver(this);
    }
    
    /**
     * �����Լ�
     * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
     */
    public void update(Observable o, Object arg) {
        System.out.println("Data has been changed to:"+((ConcreteSubject)o).getData());
    }

}
