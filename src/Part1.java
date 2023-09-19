public class Part1 {
    public static void main(String[] args) {
        // Demonstrate array creation:


        int[] fixedSizeArray = new int[10];


        int size = 5;
        int[] variableSizeArray = new int[size];

        // Literal array creation
        int[] literalArray = {1, 4, 2, 8, 5};

        // int double String char boolean
        double[] doubleArray = {1.5, 2.7, 3.2};
        String[] stringArray = {"apple", "banana", "cherry"};
        char[] charArray = {'a', 'b', 'c'};
        boolean[] booleanArray = {true, false, true};

        // Show use of array.length:
        System.out.println("Length of literalArray: " + literalArray.length);

        // Set and access array elements by index:

        fixedSizeArray[4] = 45;

        // Print array element value:
        System.out.println(" 5 element value " + fixedSizeArray[4]);

        // Demonstrate error of accessing array element by non-existing index:
        try {
            System.out.println(fixedSizeArray[1000]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error Array index out of bounds");
        }


        // Use for loop to traverse an array.
        System.out.print("Using for loop: ");
        for (int i = 0; i < literalArray.length; i++) {
            System.out.print(literalArray[i] + " ");
        }
        System.out.println();

        // Use for loop to outfoot array:
        System.out.print("Using outfoot for loop: ");
        for (int value : literalArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Use while loop to traverse an array.
        System.out.print("Using while loop: ");
        int outfoot = 0;
        while (outfoot < literalArray.length) {
            System.out.print(literalArray[outfoot] + " ");
            outfoot++;
        }
        System.out.println();
    }
}


