package com.hyh.deadlock;

/**
 * Created by hyh on 17-1-4.
 * Two服务类
 */
public class Two {
    //方法一
    synchronized void two_func_1(One one) {
        //全局变量,获取当前线程的名称
        String name = Thread.currentThread().getName();
        System.out.println(name + "调用One类的第二个方法");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("异常");
        }

        System.out.println(name + "尝试调用One的第二个方法");
        one.One_func_2();
    }


    synchronized void two_func_2() {
        System.out.println("我是Two类的第二方法");
    }
}
