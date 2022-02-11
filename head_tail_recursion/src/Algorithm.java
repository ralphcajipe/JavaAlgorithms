// Class for the Head and Tail Recursive algorithm

public class Algorithm {
    // Head recursion
    public void head_recursion(int height) {
        //base case
        if (height == 0) return;
        head_recursion(height - 1);
        System.out.println(height);
    }

    // Tail recursion
    public void tail_recursion(int height) {
        //base case
        if (height == 0) return;
        System.out.println(height);
        tail_recursion(height - 1);
    }
}
