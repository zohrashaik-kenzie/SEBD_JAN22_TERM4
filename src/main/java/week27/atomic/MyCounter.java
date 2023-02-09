package week27.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCounter {
    private int count;
    public MyCounter(int count){
        this.count = count;
    }
    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args){
        MyCounter counter = new MyCounter(10);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new Runnable() {
            public void run() {
                counter.setCount(10);
            }
        });
        executorService.execute(new Runnable() {

            public void run() {
                counter.increment();
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                counter.increment();
            }
        });
        executorService.execute(new Runnable() {
            public void run() {
                counter.setCount(3);
            }
        });

        //
        System.out.println("Counter = " + counter.getCount());

        executorService.shutdown();
    }
}
