/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasM_4;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
//instansiasi 
              Scanner scan = new Scanner(System.in);
              int nilai_input = 0,jml_nilai = 0, min = 0, max = 0;
              double avg = 0, htg_avg = 0;
              System.out.println("Menghitung rata-rata, mencari nilai Min dan Max");
              System.out.println("===============================================");
              System.out.print("Masukkan jumlah bilangan : ");
              jml_nilai = scan.nextInt();
              System.out.print("Masukkan bilangan ke 1 : ");
              nilai_input = scan.nextInt();
              min = nilai_input; max = nilai_input; avg = nilai_input;  
//pengulangan dalam menginputkan
              for(int i = 2; i <= jml_nilai; i++)
              {
                   System.out.print("Masukkan bilangan ke "+i+" : ");
                   nilai_input = scan.nextInt();
                   avg += nilai_input;
//penyeleksian untuk mendapatkan nilai minimal dan maximal
                           if(nilai_input < min)
                                  {
                                         min = nilai_input;
                                  }
                           else if (nilai_input > max)
                                  {
                                         max = nilai_input;
                                  }
              }
//hitung rata-rata dan cetak hasil nilai munimum dan maximum
System.out.println("===============================================");
              htg_avg = avg/jml_nilai;
              System.out.println("Nilai Minimum : "+min);
              System.out.println("Nilai Maximum : "+max);
              System.out.println("Nilai Rata-rata  : "+htg_avg);
    }
}
