/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.composite.safe
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.composite.transparence;

/**
 * ������
 * <p>
 * <a href="Client.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Client {
    
    public static void main(String[] args) {
        Component c = new Composite();
        Component l1 = new Leaf();
        l1.add(new Leaf());//�˾仰û���κ�����
        c.add(l1);
        c.add(new Leaf());
        
        Component c2 = new Composite();
        c2.add(new Leaf());
        
        c.add(c2);
        
        c.operation();
    }
}
