/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.templateMethod
 * 
 * �ļ����� ConcreteClass.java
 * 
 */
package com.niufish.pattern.templateMethod;

/**
 * ����ģ���ɫ
 * <p>
 * <a href="ConcreteClass.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteClass extends AbstractClass {

    /**
     * @see com.niufish.pattern.templateMethod.AbstractClass#primitiveOperation1()
     */
    protected void primitiveOperation1() {
        System.out.println("primitiveOperation1");
    }

    /**
     * @see com.niufish.pattern.templateMethod.AbstractClass#primitiveOperation2()
     */
    protected void primitiveOperation2() {
        System.out.println("primitiveOperation2");
    }

}
