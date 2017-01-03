package com.hyh.communication_2;

/**
 * Created by hyh on 17-1-3.
 * 线程通讯实体类
 *
 * @author hyh
 */
public class ProductModel {
    //变量
    private int a;
    Boolean status = false;

    //get set 方法
    synchronized int getA() {
        while (!status) {
            try {
                wait();//如果为真,则等待
            } catch (InterruptedException e) {
                System.out.println("异常");
            }
        }
        System.out.println("消费:" + a);
        status = false;//消费完了以后,设置false ,不能再消费
        notify();//通知
        return a;
    }

    synchronized void setA(int a) {
        while (status) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("异常");
            }
        }
        this.a = a;
        status = true;//生产完以后,状态这设置true
        System.out.println("生产:" + a);
        notify();//通知可以获取
    }
}
