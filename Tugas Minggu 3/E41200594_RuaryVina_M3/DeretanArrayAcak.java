
package TugasM_3;

import java.util.Arrays;
import java.util.Scanner;

public class DeretanArrayAcak {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Masukkan array : ");
        for (int i = 0; i < array.length; i++) {
            array [i]= masuk.nextInt();
        }
        System.out.println("Array = " +Arrays.toString(array));
    }
   
}
