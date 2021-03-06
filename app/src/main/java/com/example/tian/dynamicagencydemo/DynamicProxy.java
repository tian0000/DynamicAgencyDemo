package com.example.tian.dynamicagencydemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @name yanantian
 * @motto 莫羡他人谢语花, 腹有诗书气自华
 * @E-mail 1173568715@qq.com
 * @WX 15978622391
 */
//定义一个动态代理类了，每一个动态代理类都必须要实现 InvocationHandler 这个接口
public class DynamicProxy implements InvocationHandler {

    //     这个就是我们要代理的真实对象
    private Object subject;

    //    构造方法，给我们要代理的真实对象赋初值
    public DynamicProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
//      在代理真实对象前我们可以添加一些自己的操作
//        System.out.println("代理真实对象前的操作");
//        System.out.println("Method:" + method);
        //    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(subject, objects);
        //      在代理真实对象后我们也可以添加一些自己的操作
//        System.out.println("代理真实对象后的操作");
        return null;
    }
}
