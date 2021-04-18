/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_6;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SelectionSortExample {
   public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("                  PROGRAM MENGURUTKAN DATA MENGGUNAKAN SELECTION SORT              ");
        System.out.println("");
        System.out.print("Masukkan jumlah Data : ");    int n = scan.nextInt();
         
        int[] data = new int[n];        //    Array untuk nilai tiap Data
        System.out.println();
        for(int x = 0; x < n; x++)
        {
            System.out.print("Input nilai Data ke-"+(x+1)+" : ");
            data[x] = scan.nextInt();
        }
         
        System.out.println();
        System.out.print("Data Sebelum di Sorting : ");
        for(int x = 0; x < n; x++)
            System.out.print(data[x]+" ");
         
        //    Proses Selection Sort
        System.out.println("\n\nProses Selection Sort");
        for(int x = 0; x < n-1; x++)
        {
            System.out.println("Iterasi ke-"+(x+1)+" : ");
            for(int y = 0; y < n; y++)
                System.out.print(data[y]+" ");
             
            System.out.println("   Apakah Data "+data[x]+" sudah benar pada urutannya?");
             
            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "   Tidak Ada Pertukaran";
            for(int y = x+1; y < n; y++)
            {
                if(min > data[y])
                {
                    tukar = true;
                    index = y;
                    min = data[y];
                     
                }
            }
            if(tukar == true)
            {
                pesan = "   Data "+data[x]+" ditukar dengan Data "+data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }
            for(int y = 0; y < n; y++)
                System.out.print(data[y]+" ");
             
            System.out.println(pesan+"\n");
        }
        //    output setelah disorting
        System.out.print("Data Setelah di sorting : ");
        for(int x = 0; x < n; x++)
            System.out.print(data[x]+" ");
    } 
}
