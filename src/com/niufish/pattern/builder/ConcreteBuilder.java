/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.builder
 * 
 * �ļ����� ConcreteBuilder.java
 * 
 */
package com.niufish.pattern.builder;

/**
 * ���彨���ߣ���Ӧ�ó��������ص�һЩ��
 * <p>
 * <a href="ConcreteBuilder.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class ConcreteBuilder implements Builder {
    
    private Product _product = new Product1();
    
    /**
     * @see com.niufish.pattern.builder.Builder#buildPart1()
     */
    public void buildPart1() {
        _product.setPart1("A");
    }

    /**
     * @see com.niufish.pattern.builder.Builder#buildPart2()
     */
    public void buildPart2() {
        _product.setPart2("B");
    }

    /**
     * @see com.niufish.pattern.builder.Builder#getResult()
     */
    public Product getResult() {
        return _product;
    }

}
