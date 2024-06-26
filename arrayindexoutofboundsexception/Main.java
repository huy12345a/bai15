package arrayindexoutofboundsexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creareRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int index = scanner.nextInt();
        try {
            System.out.println("gia tri phan tu tai vi tri " + index + " la : "+ arr[index]);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }

}
