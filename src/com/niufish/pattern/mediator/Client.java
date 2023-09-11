/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.mediator
 * 
 * �ļ����� Client.java
 * 
 */
package com.niufish.pattern.mediator;

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
        ConcreteMediator med = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(med);
        ConcreteColleague2 c2 = new ConcreteColleague2(med);
        med.introColleagues(c1,c2);
        med.doSomething();
        c1.setHelloWords("good job!");
        c1.change();
        System.out.println("===================");
    }


}
