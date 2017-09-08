package com.example.tian.dynamicagencydemo;

/**
 * @name yanantian
 * @motto 莫羡他人谢语花, 腹有诗书气自华
 * @E-mail 1173568715@qq.com
 * @WX 15978622391
 */
//定义了一个类来实现接口，这个类就是我们的真实对象，RealSubject类
public class RealSubject implements Subject {
    @Override
    public void rent() {
        System.out.println("实现类的rent方法");
    }

    @Override
    public void hello(String str) {
        System.out.println("实现类的hello方法"+str);
    }
}
