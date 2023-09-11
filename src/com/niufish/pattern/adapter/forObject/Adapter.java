/*
 * 项目名称 Pattern
 * 包名称   com.niufish.pattern.adapter.forObject
 * 
 * 文件名称 Adapter.java
 * 
 */
package com.niufish.pattern.adapter.forObject;

import com.niufish.pattern.adapter.forClass.Adaptee;
import com.niufish.pattern.adapter.forClass.Target;

/**
 * 适配器角色，与类适配器有所区别
 * <p>
 * <a href="Adapter.java.html"><i>View Source</i></a>
 * </p>
 * @author  Kingfish
 * @version 1.0
 */
public class Adapter implements Target {
    
    /**
     * 持有的待适配对象
     */
    private Adaptee _adaptee;
    
    /**
     * 初始化持有的适配对象
     * @param adaptee 适配对象
     */
    public Adapter(Adaptee adaptee){
        _adaptee = adaptee;
    }
    
    /**
     * @see com.niufish.pattern.adapter.forClass.Target#request()
     */
    public void request() {
        _adaptee.specificRequest();
    }

}
