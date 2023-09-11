/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.builder
 * 
 * �ļ����� Builder.java
 * 
 */
package com.niufish.pattern.builder;

/**
 * �������ߣ��淶��Ʒ����ĸ�����ɳɷֵĽ��졣һ����ԣ��˽ӿڶ�����Ӧ�ó������ҵ�߼���
 * <p>
 * <a href="Builder.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Builder {
    
    void buildPart1();
    
    void buildPart2();
    
    Product getResult();
    
}
