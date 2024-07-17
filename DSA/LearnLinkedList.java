import java.util.*;

public class LearnLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedListAsStack = new LinkedList<String>();
        // We can treat a linked list as a stack
        linkedListAsStack.push("A");
        linkedListAsStack.push("B");
        linkedListAsStack.push("C");
        linkedListAsStack.push("D");
        linkedListAsStack.push("F");
        linkedListAsStack.pop();

        System.out.println(linkedListAsStack);
        
        LinkedList<String> linkedListAsQueue = new LinkedList<String>();
    }
}
