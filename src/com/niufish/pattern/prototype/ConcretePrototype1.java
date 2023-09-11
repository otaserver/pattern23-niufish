/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.prototype
 * 
 * �ļ����� ConcretePrototype1.java
 * 
 */
package com.niufish.pattern.prototype;

/**
 * �����ԭʼģ����1
 * <p>
 * <a href="ConcretePrototype1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcretePrototype1 implements Cloneable {
    
    private String _type;
    
    public String getType() {
        return _type;
    }
    
    public void setType(String type) {
        this._type = type;
    }
    
    /**
     * ��¡����
     * @see java.lang.Object#clone()
     */
    public Object clone(){
        ConcretePrototype1 temp = new ConcretePrototype1();
        temp.setType(_type);
        return (Object)temp;
    }
}
