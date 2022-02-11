public class euclid_gcd {
    // Main
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("GCD (" + a + ", " + b + ") = " + gcd(a, b));

    }

    // Function Definition

    public static int gcd(int a, int b) {
        // Recursive function
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
