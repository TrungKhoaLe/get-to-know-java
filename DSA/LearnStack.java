import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        /*
         * Its LIFO - last in first out
         *
         * uses of stack?
         * 1. undo/redo features in text editor,
         * 2. moving back/forward through browser history
         * 3. backtracking algorithms (maze, file directories)
         * 4. calling functions (call stack)
         */
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        System.out.println(stack.empty());
        System.out.println(stack);
        
        stack.pop();
        System.out.println(stack);

        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.search("DOOM"));
    }
}
