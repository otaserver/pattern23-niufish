/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.builder
 * 
 * 文件名称 Product.java
 * 
 */
package com.niufish.pattern.builder;

/**
 * 产品的抽象
 * <p>
 * <a href="Product.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public interface Product {
    
    public String getPart1();

    public void setPart1(String part1);

    public String getPart2();

    public void setPart2(String part2);
}