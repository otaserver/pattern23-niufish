/*
 * ��Ŀ���� Pattern
 * ������   com.niufish.pattern.builder
 * 
 * �ļ����� Director.java
 * 
 */
package com.niufish.pattern.builder;

/**
 * ���ݣ������й���Ĺ������� <br />
 * ��Client��ϲ�ʱ��Ҫ�ѽ����ϸ�ڷŵ�ConcreteBuilder��ȥ
 * <p>
 * <a href="Director.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Director {
    
    private Builder _builder;
    
    /**
     * ��Ʒ���췽����������ø���������췽��
     */
    public void construct(){
        _builder = new ConcreteBuilder();
        _builder.buildPart1();
        _builder.buildPart2();
        System.out.println(_builder.getResult().toString());
    }
    

}
