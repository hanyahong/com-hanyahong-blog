package com.hyh.deadlock;

/**
 * Created by hyh on 17-1-4.
 * Two服务类
 */
public class Two {

    synchronized void two_func_1(One one) {
        //全局变量,获取当前线程的名称
        String name = Thread.currentThread().getName();
    }


    synchronized void two_func_2() {
        System.out.println("我是Two类的第二方法");
    }

}
