// Head and Tail recursion

public class App {
    public static void main(String[] args) {
        Algorithm algo = new Algorithm();

        // Head recursion
        System.out.println("Head recursion");
        algo.head_recursion(4);

        System.out.println();

        // Similar to iteration
        System.out.println("Tail recursion");
        algo.tail_recursion(4);
    }
}