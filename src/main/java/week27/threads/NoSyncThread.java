package week27.threads;

class NoSyncThread extends Thread {
    private Thread t;
    private String threadName;
    PrintDemo  PD;

    NoSyncThread( String name,  PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    public void run() {
        PD.printCount();
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
