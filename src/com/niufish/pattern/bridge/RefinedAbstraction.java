/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.bridge
 * 
 * �ļ����� RefinedAbstraction.java
 * 
 */
package com.niufish.pattern.bridge;

/**
 * ��չ�����࣬�ı�������������Ķ���
 * <p>
 * <a href="RefinedAbstraction.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * @param imp
     */
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    /**
     * @see com.niufish.pattern.bridge.Abstraction#operation()
     */
    public void operation() {
        super.print("RefinedAbstraction");
    }

}
