package com.hyh.deadlock;

/**
 * Created by hyh on 17-1-4.
 * .
 * 主类,用来产生死锁
 *
 * @author hyh
 */
public class Deadlock implements Runnable {
    //创建俩对象
    One one = new One();
    Two two = new Two();

    //该类构造方法
    public Deadlock() {
        Thread.currentThread().setName("主线程");
        Thread thread = new Thread(this, "副线程");
        thread.start();
        //调用
        one.one_func_1(two);
        System.out.println("返回到主线程");
    }

    //主线程的启动方法
    public void run() {
        two.two_func_1(one);
        System.out.println("返回到其他线程");
    }

    //主方法
    public static void main(String[] args) {
        //创建对象
        new Deadlock();
    }
}
