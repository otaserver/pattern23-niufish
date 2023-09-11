/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.iterator
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.iterator;

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
        Aggregate agg = new ConcreteAggregate();
        Iterator it = agg.createIterator();
        while (!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
}
