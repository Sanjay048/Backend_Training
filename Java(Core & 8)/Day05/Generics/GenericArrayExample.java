/*Write a generic method printArray(T[] array) to print elements of any array type.
Test it with arrays of String, Integer, and Double.*/

package Day5;

public class GenericArrayExample {

        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            String[] stringArray = {"sanji", "zoro", "luffy", "nami"};
            System.out.println("String Array:");
            printArray(stringArray);

            Integer[] integerArray = {1, 2, 3, 4, 5};
            System.out.println("Integer Array:");
            printArray(integerArray);

            Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
            System.out.println("Double Array:");
            printArray(doubleArray);
        }

}
