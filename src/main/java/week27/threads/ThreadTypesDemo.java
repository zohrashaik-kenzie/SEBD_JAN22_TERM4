package week27.threads;

public class ThreadTypesDemo {
    public static void main(String[] args) {
//        RandomThread t = new RandomThread();
//        t.setName("RandomThread Thread1");
//        runExampleThread(t);

//        //TIMED_WAITING Thread
//        SleepingThread t2 = new SleepingThread();
//        t2.setName("SleepingThread Thread2");
//        runExampleThread(t2);

//        //WAITING Thread
////        System.out.println("------------------------------------------------------------");
//        WaitingThread t3 = new WaitingThread();
//        t3.setName("WaitingThread Thread3");
//        runExampleThread(t3);
//        synchronized (ThreadTypesDemo.class) {
//            ThreadTypesDemo.class.notifyAll();
//        }

//        //BLOCKED Thread
        new Thread(() -> {
            //acquiring lock on ThreadsTypeDemo  object
            synchronized (ThreadTypesDemo.class) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        BlockedThread t4 = new BlockedThread();
        t4.setName("BlockedThread Thread4");
        runExampleThread(t4);
    }

    static void runExampleThread(Thread t) {
        printState(" before calling the start method;", t);
        t.start();
        printState(" after calling the start method;", t);
        printState(" main thread before sleeping for 1/2 sec;", t);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printState("main thread after being woken up from sleeping for 1/2 sec;", t);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            printState("shutting down;", t);
        }));
    }

    static void printState(String msg, Thread t) {
        System.out.printf("%s - %s state: %s%n",t.getName(), msg,
                t.getState());
    }

    private static class RandomThread extends Thread {

        @Override
        public void run() {
            printState("thread run() started;", this);
            //doing something
            for (int i = 0; i < 100; i++) {
                Math.random();
            }
            printState("thread is finishing;", this);
        }
    }

    private static class SleepingThread extends Thread {
        @Override
        public void run() {
           printState("thread run() started;", this);
            try {
                //this will put the thread in TIMED_WAITING state
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            printState("thread finishing;", this);
        }
    }

    private static class WaitingThread extends Thread {

        @Override
        public void run() {
            printState("thread run() started;", this);
            //using Example3.class object monitor
            synchronized (ThreadTypesDemo.class) {
                try {
                    //this will put the thread in WAITING state
                    ThreadTypesDemo.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
           printState("thread finishing;", this);
        }
    }

    private static class BlockedThread extends Thread {
        @Override
        public void run() {
            printState("attempting to enter synchronized block;", this);
            synchronized (ThreadTypesDemo.class) {
                printState("entered synchronized block;", this);
                //do something
            }
            printState("thread finishing;", this);
        }
    }
}
