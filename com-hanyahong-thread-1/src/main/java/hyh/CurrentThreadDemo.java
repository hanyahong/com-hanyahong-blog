package hyh;

/**
 * Created by hyh on 17-1-1.
 * 简单测试thread 线程测试
 */
public class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread thread = Thread.currentThread();
        System.out.println("当前线程:" + thread);

        thread.setName("hyh thread");//修改线程名称

        System.out.println("修改名称之后:" + thread);

        try {
            for (int a = 5; a > 0; a--) {
                System.out.println(a);

                thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("出现异常");
        }
    }
}
