package week27.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomicity3 {

    AtomicInteger i;

    public void incrementNumber() {
        i.getAndIncrement();
    }
}
