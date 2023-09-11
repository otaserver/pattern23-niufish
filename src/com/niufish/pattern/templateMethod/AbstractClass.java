/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.templateMethod
 * 
 * �ļ����� AbstractClass.java
 * 
 */
package com.niufish.pattern.templateMethod;

/**
 * ����ģ���ɫ
 * <p>
 * <a href="AbstractClass.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public abstract class AbstractClass {
    
    /**
     * ģ�淽��<br />
     * �����߼��ĹǼ�
     */
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }

    /**
     * ��������1��������ʵ��
     */
    protected abstract void primitiveOperation1();

    /**
     * ��������2��������ʵ��
     */
    protected abstract void primitiveOperation2();

}
