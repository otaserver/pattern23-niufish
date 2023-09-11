/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.builder
 * 
 * 文件名称 ConcreteBuilder.java
 * 
 */
package com.niufish.pattern.builder;

/**
 * 具体建造者，与应用程序紧密相关的一些类
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
