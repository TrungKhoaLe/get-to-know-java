import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        /*
         * Priority queue = A FIFO data structure that serves elements
         * with the highest priorities first before elements with lower priority
         */
        Queue<Double> queue = new LinkedList<Double>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        
        // Queue<Double> priorityQueue = new PriorityQueue<Double>(Collections.reverseOrder()); // the order will be the descending order.
        Queue<Double> priorityQueue = new PriorityQueue<Double>(); // the order will be the ascending order.
        priorityQueue.offer(3.0);
        priorityQueue.offer(2.5);
        priorityQueue.offer(4.0);
        priorityQueue.offer(1.5);
        priorityQueue.offer(2.0);

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }

        Queue<String> priorityStringQueue = new PriorityQueue<String>();
        priorityStringQueue.offer("B");
        priorityStringQueue.offer("C");
        priorityStringQueue.offer("A");
        priorityStringQueue.offer("F");
        priorityStringQueue.offer("D");

        while(!priorityStringQueue.isEmpty()) {
            System.out.println(priorityStringQueue.poll());
        }
    }
}
