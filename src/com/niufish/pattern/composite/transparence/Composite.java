/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.composite.transparence
 * 
 * �ļ����� Composite.java
 * 
 */
package com.niufish.pattern.composite.transparence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ��֦��ɫ������μ���ϵ����¼��Ӷ���Ķ���<br />
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
     * @see com.niufish.pattern.composite.transparence.Component#operation()
     */
    public void operation() {
        System.out.println("͸���ϳɶ���:operation");
        Iterator it = _componentList.iterator();
        while (it.hasNext()){
            ((Component)it.next()).operation();
        }        
    }

    /**
     * @see com.niufish.pattern.composite.transparence.Component#add(com.niufish.pattern.composite.transparence.Component)
     */
    public void add(Component component) {
        _componentList.add(component);
    }

    /**
     * @see com.niufish.pattern.composite.transparence.Component#remove(com.niufish.pattern.composite.transparence.Component)
     */
    public void remove(Component component) {
        _componentList.remove(component);
    }

}
