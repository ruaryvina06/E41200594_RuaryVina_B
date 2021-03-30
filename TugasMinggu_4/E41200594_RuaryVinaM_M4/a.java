/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasM_4;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nil_awal, nil_akhir;
        
        System.out.println("Menampilkan nilai bilangan genap");
        System.out.println("================================");
        System.out.print("Masukkan nilai awal : ");
        nil_awal = input.nextInt();
        System.out.print("Masukkan nilai akhir : ");
        nil_akhir = input.nextInt();
        System.out.println("================================");
        System.out.println("Tampilkan nilai = ");
        for (int i = nil_awal; i <= nil_akhir; i++) {
            if (i%2==0) {
                System.out.print(i +",");
            }
        }  
    }
}
