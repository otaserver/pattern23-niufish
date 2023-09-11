/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.composite.safe
 * 
 * �ļ����� Leaf.java
 * 
 */
package com.niufish.pattern.composite.safe;

/**
 * ��Ҷ�࣬����û���¼����󣬶�����μ���ϵ�������ĳ�ֲ�����
 * <p>
 * <a href="Leaf.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Leaf implements Component {

    /**
     * @see com.niufish.pattern.composite.safe.Component#operation()
     */
    public void operation() {
        System.out.println("��ȫ��Ҷ����:operation");
    }

    /**
     * @see com.niufish.pattern.composite.safe.Component#getComposite()
     */
    public Composite getComposite() {
        return null;
    }

}
