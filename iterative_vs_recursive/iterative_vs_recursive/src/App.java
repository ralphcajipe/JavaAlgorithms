// Sum of Natural Numbers in Iterative vs Recursive

public class App {
    public static void main(String[] args) {

        // Create instance of class Algo1
        Algorithm algo = new Algorithm();

        /* Provide Arguments and Function calls */

        System.out.println("Iterative Approach");
        System.out.println("Sum: " + algo.sum_iterative(2));
        // 1+2 = 3

        System.out.println();

        System.out.println("Recursive Approach");
        System.out.println("Sum: " + algo.sum_recursive(3));
        // 1+2+3 = 6
    }
}
