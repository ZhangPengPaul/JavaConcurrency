package chapter1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 14-9-10
 * Time: 下午3:18
 * To change this template use File | Settings | File Templates.
 */
public class MyThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 100; i++) {
            Runnable runner = new Runner(i);

            executorService.execute(runner);
        }

        executorService.shutdown();
    }

}

class Runner implements Runnable {
    int index = 0;

    public Runner(int index) {
        this.index = index;
    }


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
        long time = (long) (Math.random() * 1000);

        System.out.println("Thread: " + Thread.currentThread().getName() +
                "(Target" + index + ")" + ":Sleeping" + time + "ms.");

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
