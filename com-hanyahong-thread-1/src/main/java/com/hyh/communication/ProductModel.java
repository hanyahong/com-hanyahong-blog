package com.hyh.communication;

/**
 * Created by hyh on 17-1-3.
 * 线程通讯实体类
 *
 * @author hyh
 */
public class ProductModel {
    //变量
    private int a;

    //get set 方法
    synchronized int getA() {
        System.out.println("消费:" + a);
        return a;
    }

    synchronized void setA(int a) {
        System.out.println("生产:" + a);
        this.a = a;
    }


}
