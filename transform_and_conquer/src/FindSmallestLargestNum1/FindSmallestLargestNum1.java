package FindSmallestLargestNum1;

// Look for the smallest and largest number
// First and basic approach
public class FindSmallestLargestNum1 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 7, 4, 9, 6, 8, 1, 20, 2};
        int smallest = array[0];
        int largest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest)
                largest = array[i];
            else if (array[i] < smallest)
                smallest = array[i];
        }

        System.out.println("Smallest number is " + smallest);
        System.out.println("Largest number is " + largest);
    }
}



