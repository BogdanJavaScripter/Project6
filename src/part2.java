import java.util.Random;
import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4. Sum of array elements
        int[] userArray = inputArray(scanner);
        int sum = calculateSum(userArray);
        System.out.println("Sum of array elements: " + sum);

        // 5. Largest value in an array
        int[] randomArray = createRandomArray(scanner);
        int largestValue = findLargestValue(randomArray);
        System.out.println("Largest value in the array: " + largestValue);

        // 6. Search value in array method
        System.out.print("Enter a value to search in the array: ");
        int searchValue = scanner.nextInt();
        int index = searchValueInArray(userArray, searchValue);
        if (index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found in the array.");
        }

        scanner.close();
    }

    // 1. Input Array Method
    public static int[] inputArray(Scanner scanner) {
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    // 2. Create an array with random values method
    public static int[] createRandomArray(Scanner scanner) {
        System.out.print("Enter the length of the random array: ");
        int length = scanner.nextInt();
        int[] newArray = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            newArray[i] = random.nextInt(100); // Generating random values between 0 and 99
        }
        return newArray;
    }

    // 3. Print Array Method
    public static void printArray(int[] array) {
        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 4. Sum of array elements
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // 5. Largest value in an array
    public static int findLargestValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // 6. Search value in array method
    public static int searchValueInArray(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}





