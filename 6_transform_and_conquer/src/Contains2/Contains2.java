package Contains2;

class Contains2 {
    public static boolean contains(int[] a, int b) {
        for (int i : a) {
            System.out.println("Comparing with " + i);
            if (i == b) {
                return true;
            } else if (i > b) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11};
        boolean ans = contains(a, 4);
        if (ans) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
