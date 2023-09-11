/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.proxy
 * 
 * �ļ����� Proxy.java
 * 
 */
package com.niufish.pattern.proxy;

/**
 * �ǲ�Ƥ�Ĵ���
 * <p>
 * <a href="Proxy.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Proxy implements Subject {
    
    /**
     * ���е������ɻ����
     */
    private RealSubject _realSubject;
    
    /**
     * @see com.niufish.pattern.proxy.Subject#request()
     */
    public int request() {
        _realSubject = new RealSubject();
        int costOfProxy = 10;
        int cost = _realSubject.request();
        return cost+costOfProxy;
    }

}
