// A class for algorithm of iterative and recursive approach

public class Algorithm {
    public int sum_iterative(int num) {
        // Calculate sum of numbers using iteration.
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public int sum_recursive(int num) {
        // Calculate sum of numbers using recursion.
        if (num == 1) return 1;

        return num + sum_recursive(num - 1);
    }
}
