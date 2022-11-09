package week27.threads;

class SyncThread extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  pDemo;

    SyncThread( String name,  PrintDemo pd) {
        threadName = name;
        pDemo = pd;
    }

    public void run() {
        synchronized(pDemo) {
            pDemo.printCount();
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}