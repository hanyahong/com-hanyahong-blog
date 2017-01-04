package com.hyh.thread;

/**
 * Created by hyh on 17-1-1.
 * 线程第三种实现方式
 */
public class Demo3 extends Thread {
    public Demo3() {
        //创建新线程
        super("线程Demo");
        System.out.println("子线程:" + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int a = 5; a > 0; a--) {
                System.out.println("子线程:" + a);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("子程序异常");
        }
    }

}

class MasterThread {
    public static void main(String args[]) {
        new Demo3();//创建新线程

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("主线程:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("主程序异常");
        }
        System.out.println("主程序退出...");
    }


}
