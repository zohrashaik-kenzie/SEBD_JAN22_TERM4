package week27.threads;

public class ThreadDemo {
    public static void main(String args[]) {

        PrintDemo PD = new PrintDemo();

        NoSyncThread T1 = new NoSyncThread( "Thread - 1 ", PD );
        NoSyncThread T2 = new NoSyncThread( "Thread - 2 ", PD );

        T1.start();
        T2.start();

        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch ( Exception e) {
            System.out.println("Interrupted");
        }
    }
}
