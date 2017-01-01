package hyh;

/**
 * Created by hyh on 17-1-1.
 * 使用集成Runnable方式 三个线程的实现
 */
public class Demo4 implements Runnable {
    //全局变量
    String name;
    Thread thread;

    //构造器
    public Demo4(String th) {
        name = th;
        thread = new Thread(this, name);
        System.out.println("新线程" + thread);
        //开始线程
        thread.start();
    }

    //重写run方法
    public void run() {
        try {
            for (int a = 5; a > 0; a--) {
                System.out.println(name + ":" + a);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("异常");
        }
        System.out.println(name + "线程结束");
    }
}

/**
 * 测试类
 */
class MultThreadDemo {

    public static void main(String[] args) {
        //创建三个线程
        new Demo4("线程一");
        new Demo4("线程二");
        new Demo4("线程三");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("线程异常");
        }
        System.out.println("全部线程结束");
    }
}