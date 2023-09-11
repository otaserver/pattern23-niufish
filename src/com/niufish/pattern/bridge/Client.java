/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.bridge
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.bridge;

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
        Implementor imp = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imp);
        abs.operation();
        Implementor imp2 = new ConcreteImplementorB();
        Abstraction abs2 = new RefinedAbstraction(imp2);
        abs2.operation();
        
    }
}
