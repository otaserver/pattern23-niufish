/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.prototype
 * 
 * �ļ����� ConcretePrototype1.java
 * 
 */
package com.niufish.pattern.prototype;

/**
 * �����ԭʼģ����2
 * <p>
 * <a href="ConcretePrototype2.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcretePrototype2 implements Cloneable {
    
    private String _name;
    
    public String getName() {
        return _name;
    }
    
    public void setName(String type) {
        this._name = type;
    }
    
    /**
     * ��¡����
     * @see java.lang.Object#clone()
     */
    public Object clone(){
        ConcretePrototype2 temp = new ConcretePrototype2();
        temp.setName(_name);
        return (Object)temp;
    }
}
