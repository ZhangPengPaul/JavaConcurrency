package chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-9-10
 * Time: 下午2:52
 * To change this template use File | Settings | File Templates.
 */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(this.getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new MyThread("thread" + i).start();
        }
    }
}
