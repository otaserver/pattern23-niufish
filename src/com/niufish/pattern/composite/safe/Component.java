/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.composite.safe
 * 
 * �ļ����� Component.java
 * 
 */
package com.niufish.pattern.composite.safe;

/**
 * ���󹹼���ɫ�������μ���ϵĶ�����������Ľӿڼ���Ĭ����Ϊ��
 * ���������������е��Ӷ���<br />
 * �ڰ�ȫʽ�ĺϳ�ģʽ����ﲻ����������Ӷ���ķ�������һ��������֦�������
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
     * �����Լ���ʵ��
     * @return �Լ���ʵ��
     */
    Composite getComposite();
    
}
