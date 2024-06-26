package arrayindexoutofboundsexception;

import java.util.Random;

public class ArrayExample {
    public Integer[] creareRandom(){
        Random rand = new Random();
        Integer[] array = new Integer[10];
        System.out.println(" danh sach phan tu cua mang : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.println(array[i]+ " ");
        }return array;
    }
}
