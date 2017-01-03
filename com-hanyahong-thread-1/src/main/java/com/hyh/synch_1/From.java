package com.hyh.synch_1;

/**
 * Created by hyh on 17-1-1.
 * 发送者类
 * @author hyh
 */
public class From implements Runnable {

    //全局变量
    String meg;
    Message message;
    Thread thread;

    //构造函数
    public From(Message message, String meg) {
        this.message = message;
        this.meg = meg;
        thread = new Thread(this);
        thread.start();
    }

    //重写父类函数
    public void run() {
        message.sendMeg(meg);
    }
}
