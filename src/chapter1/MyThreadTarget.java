package chapter1;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-9-10
 * Time: 下午3:11
 * To change this template use File | Settings | File Templates.
 */
public class MyThreadTarget implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Runnable r = new MyThreadTarget();
            new Thread(r, "thread" + i).start();
        }
    }
}
