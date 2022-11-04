package week14.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation2 {
        public static void main (String[]args)
        {
            Queue<String> q = new LinkedList<>();

            //Adding elements to the Queue
            q.add("A");
            q.add("B");
            q.add("C");
            q.add("D");
            q.add("E");
            q.add("F");
            System.out.println("Elements in Queue:" + q);

            System.out.println("Removed element: " + q.remove());

            System.out.println("Elements in Queue after removing element:" + q);

            System.out.println("Head: " + q.element());

            //System.out.println("Removed element: " + q.remove());
            //System.out.println("Head: " + q.element());

            System.out.println("poll(): " + q.poll());
            System.out.println("Elements in Queue:" + q);

            System.out.println("peek(): " + q.peek());

            System.out.println("Elements in Queue:" + q);
        }
}
