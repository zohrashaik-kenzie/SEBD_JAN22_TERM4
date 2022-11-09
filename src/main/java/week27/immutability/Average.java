package week27.immutability;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Average {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        {
            ExecutorService es = Executors.newCachedThreadPool();
            // Create a future and get a result
            final double firstAverage = es.submit(()->200.0/50.0).get();
            // Create a future and get a second result
            final double secondAverage = es.submit(()->firstAverage + (225.0/50.0)).get();
            final double thirdAverage = es.submit(()->secondAverage + (100.0/50.0)).get();
            System.out.println(thirdAverage);
            es.shutdown();
        }
    }
}
