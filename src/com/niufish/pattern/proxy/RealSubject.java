/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.proxy
 * 
 * �ļ����� RealSubject.java
 * 
 */
package com.niufish.pattern.proxy;

/**
 * �����ɻ����
 * <p>
 * <a href="RealSubject.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class RealSubject implements Subject {
    
    /**
     * ����
     */
    private void doThis(){
        System.out.print("�ձ��ļ۸�");
    }

    /**
     * ���ǣ��������˲�������
     * @return �ɱ�
     */
    private int doThat(){
        return 2;
    }

    /**
     * @see com.niufish.pattern.proxy.Subject#request()
     */
    public int request() {
        doThis();
        return doThat();
    }

}
