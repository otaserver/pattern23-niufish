/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.composite.safe
 * 
 * �ļ����� Composite.java
 * 
 */
package com.niufish.pattern.composite.safe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ��֦��ɫ������μ���ϵ����¼��Ӷ���Ķ���<br />
 * ������������й����Ӷ���ķ���
 * <p>
 * <a href="Composite.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Composite implements Component {
    
    /**
     * �����Ӷ��������
     */
    private List _componentList = new ArrayList();
    
    /**
     * @see com.niufish.pattern.composite.safe.Component#operation()
     */
    public void operation() {
        System.out.println("��ȫ�ϳɶ���:operation");
        Iterator it = _componentList.iterator();
        while (it.hasNext()){
            ((Component)it.next()).operation();
        }
    }
    
    /**
     * @see com.niufish.pattern.composite.safe.Component#getComposite()
     */
    public Composite getComposite() {
        return this;
    }

    /**
     * ����һ���Ӷ���
     * @param component
     */
    public void add(Component component){
        _componentList.add(component);
    }
    
    /**
     * ɾ��һ���Ӷ���
     * @param component
     */
    public void remove(Component component){
        _componentList.remove(component);
    }

}
