/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.visitor
 * 
 * �ļ����� ObjectStructure.java
 * 
 */
package com.niufish.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * �ṹ�����ɫ
 * <p>
 * <a href="ObjectStructure.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ObjectStructure {
    
    /**
     * ���е�Ԫ�صľۼ�
     */
    private List _elements;
    
    /**
     * ��ʼ��Ԫ�صľۼ�
     */
    public ObjectStructure(){
        _elements = new ArrayList();
    }
    
    /**
     * ִ�з��ʲ���
     * @param visitor
     */
    public void action(Visitor visitor){
        Iterator it = _elements.iterator();
        while (it.hasNext()){
            Element e = (Element)it.next();
            e.accept(visitor);
        }
    }
    
    /**
     * ����һ���µ�Ԫ��
     * @param el �µ�Ԫ��
     */
    public void add(Element el){
        _elements.add(el);
    }

}
