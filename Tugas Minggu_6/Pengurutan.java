/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_6;
import java.io.*;
import java.util.Scanner;
public class Pengurutan {
    public static void main(String[] args) {
        
        int Data,nilai = 0;
        int b, k, a, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Input banyaknya jumlah data : ");
        try{
            nilai=input.nextInt();
        }
        catch(Exception e){
            System.out.println("Data Harus Berupa angka!!!");
        }
        int angka[] = new int[nilai];
        int angka_desc[] = new int[nilai];
        for(b=0;b<nilai;b++){
            System.out.print("Masukkan data ke - " + (b+1) + " : ");
            try{
                Data = input.nextInt();
                angka[b]=Data;
                angka_desc[b]=Data;
            }
            catch(Exception e){
                System.out.println("Data Harus Berupa angka!!!");
            }
        }
        for(b=0;b<nilai-1;b++){
            for(k=b+1;k<nilai;k++){
                if(angka_desc[b]< angka_desc[k]){
                    temp=angka_desc[b];
                    angka_desc[b]=angka_desc[k];
                    angka_desc[k]=temp;
                }
            }
        }
        System.out.print("\n\nData sebelum diurutkan : ");
        for(b=0;b<nilai;b++){
            System.out.print(angka[b] + ", ");
        }
        System.out.print("\nData setelah diurutkan Descending :             \n");
        for(b=0;b<nilai;b++){
            System.out.print(angka_desc[b] + ", ");
        }
        System.out.println("");

    }
}
