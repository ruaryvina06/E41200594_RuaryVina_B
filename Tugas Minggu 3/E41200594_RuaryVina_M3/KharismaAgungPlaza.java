/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasM_3;
import java.util.Scanner;
public class KharismaAgungPlaza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
         System.out.println("--------------------------------------------------------");
         System.out.println("               Kharisma Agung Plaza < KAP >             ");
         System.out.println("                 Promo Belanja Berhadiah                ");
         System.out.println("            Khusus Pembelian 5 Barang Pertama           ");
         System.out.println("            Dengan Harga minimum Rp. 10,000,00          ");
         System.out.println("--------------------------------------------------------");
         System.out.print("Masukkan nama pembeli : ");
         nama = scan.nextLine();
         System.out.println("");
         System.out.print("Masukkan harga barang ke-1 : ");
         int harga1 = scan.nextInt();
         System.out.print("Masukkan harga barang ke-2 : ");
         int harga2 = scan.nextInt();
         System.out.print("Masukkan harga barang ke-3 : ");
         int harga3 = scan.nextInt();
         System.out.print("Masukkan harga barang ke-4 : ");
         int harga4 = scan.nextInt();
         System.out.print("Masukkan harga barang ke-5 : ");
         int harga5 = scan.nextInt();
         System.out.println("");
         int total = harga1+harga2+harga3+harga4+harga5;
         System.out.println("Total pembelian atas nama " + nama + "adalah " + total);
          if (total >= 100000){
              System.out.println("Selamat......");
              System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
          } else if( total >=50000){
              System.out.println("Selamat......");
              System.out.println("Anda mendapatkan hadiah 1 buah piring cantik");
          } else{
              System.out.println("Selamat......");
              System.out.println("Anda mendapatkan hadiah 1 buah sabun piring");
          }
              System.out.println("--------------------------------------------------------");
              System.out.println("                       Terima Kasih                     ");
              System.out.println("      Anda sudah berbelanja di Kharisma Agung Plaza     ");         
    }  
}
