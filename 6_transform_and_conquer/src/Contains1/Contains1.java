package Contains1;

class Contains1 {
    public static boolean contains(int[] a, int b) {
        for (int i : a) {
            System.out.println("Comparing with " + i);
            if (i == b) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 3, 7, 9, 8, 10};
        boolean ans = contains(a, 4);
        if (ans) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

    }


}

