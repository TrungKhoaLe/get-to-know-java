import java.util.Queue;
import java.util.LinkedList;

public class LearnQueue {
    public static void main(String[] args) {
        /*
         * Queue = FIFO. A collection designed to hold elements prior to processing
         * Linear data structure
         *
         * add = enqueue, offer()
         * remove = dequeue, poll()
         */
        
        Queue<String> queue = new LinkedList<String>(); // Queue is an interface, and LinkedList is one of the implementations of Queue
        System.out.println(queue.isEmpty()); // method that inherits from the Collection class
        System.out.println(queue.size()); // method that inherits from the Collection class

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.contains("Harold")); // method that inherits from the Collection class
        
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

        /*
         * Where are queues useful?
         * 1. Keyboard buffer (letters should appear on the screen in the order they're pressed,
         * 2. printer queue (print jobs should be completed in order),
         * 3. used in LinkedLists, PriorityQueues, Breadth-first search (an algorithm)
         */ 
    }
}
