package LinearSearch;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        //loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] a) {
        int[] a1 = {30, 20, 10, 50, 40, 90};
        int key = 100;
        System.out.println(key + " is found at index: " + linearSearch(a1, key));
    }

}
