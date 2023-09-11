/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.composite.transparence
 * 
 * �ļ����� Component.java
 * 
 */
package com.niufish.pattern.composite.transparence;


/**
 * ���󹹼���ɫ�������μ���ϵ��ඨ��������Ľӿڼ���Ĭ����Ϊ��
 * ��������������е��Ӷ���Ľӿڶ��塣<br />
 * <p>
 * <a href="Component.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Component {
    
    /**
     * ĳ�ֲ���
     */
    void operation();

    /**
     * ����һ���Ӷ���
     * @param component �Ӷ���
     */
    void add(Component component);
    
    /**
     * ɾ��һ���Ӷ���
     * @param component �Ӷ���
     */
    void remove(Component component);
}
