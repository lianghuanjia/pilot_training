import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array (N): ");
        int N = scanner.nextInt();
        ArrayGenerator arrayGenerator = new ArrayGenerator(N);
        int[] array = arrayGenerator.getArray();
        System.out.println("Generated Array: " + Arrays.toString(array));


        while(true){
            System.out.println("Enter command: S(search), D(delete), E(exit): ");
            String command = scanner.next().toUpperCase();
            if (command.equals("S")){
                System.out.println("Enter number to search: ");
                int num = scanner.nextInt();
                boolean found = false;
                int theIndex = -1;
                for (int i = 0; i < N; i++) {
                    if (array[i] == num) {
                        found = true;
                        theIndex = i;
                        break;
                    }
                }
                if (found){
                    System.out.println("Found at: "+theIndex);
                }else {
                    System.out.println("Not found");
                }
            } else if (command.equals("D")) {
                System.out.println("Enter the index to delete: ");
                int index = scanner.nextInt();
                if (index >= 0 && index < N){
                    array = deleteElement(array, index);
                    System.out.println("Updated array: "+Arrays.toString(array));
                }else{
                    System.out.println("Invalid index");
                }
            } else if (command.equals("E")) {
                break;
            }else {
                System.out.println("invalid command. Enter S, D, or E");
            }
        }
        scanner.close();
    }

    public static int[] deleteElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
