/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.facade
 * 
 * �ļ����� Facade.java
 * 
 */
package com.niufish.pattern.facade;

/**
 * �����ɫ
 * <p>
 * <a href="Facade.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Facade {
    
    private SubSystem1 s1 = new SubSystem1();
    
    private SubSystem2 s2 = new SubSystem2();
    
    /**
     * ����ϵͳ�еĶ������
     */
    public void OperationWrapper(){
        s1.operation();
        s2.operation();
    }
}
