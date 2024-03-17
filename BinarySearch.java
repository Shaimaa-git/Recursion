import java.util.Scanner;

class Search {

    public static void main(String args[]) {

        // create an object of Main class
        Search obj = new Search();

        // create a sorted array
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = array.length;

        // get input from user for element to be searched
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the target element:");

        // element to be searched
        int targetElement = input.nextInt();
        input.close();

        // call the binary search method
        int result = obj.binarySearch(array, targetElement, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
    int binarySearch(int array[], int element, int low, int high) {

        // Repeat the loop until low and high meet each other
        while (low <= high) {

            // find index of mid element
            int mid = low + (high - low) / 2;

            //check  if target element is the mid-element
            if (array[mid] == element)
                return mid;

            // check if target element is less than mid-element
            // search only the left side of mid
            if (array[mid] < element)
                low = mid + 1;

            // if element is greater than mid-element
            //search only the right side of mid
            else
                high = mid - 1;
        }

        return -1;
    }

}
