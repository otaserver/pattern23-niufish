/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.builder
 * 
 * �ļ����� Product1.java
 * 
 */
package com.niufish.pattern.builder;

/**
 * �����Ʒ��
 * <p>
 * <a href="Product1.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Product1 implements Product {
    
    private String _part1;
    
    private String _part2;
    
    public String getPart1() {
        return _part1;
    }
    public void setPart1(String part1) {
        this._part1 = part1;
    }
    public String getPart2() {
        return _part2;
    }
    public void setPart2(String part2) {
        this._part2 = part2;
    }
    
    public String toString(){
        return "part1:"+_part1+" part2:"+_part2;
    }
}
