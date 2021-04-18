/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_6;

import java.util.Scanner;
public class BinarySearch {
    public static int[] data = null;
	public static int n_awal, n_tengah, n_akhir, temp, count;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//	Input jumlah data
		System.out.print("Masukkan Jumlah Data : ");		
		int jumlah = scan.nextInt();
		
		//	Input tiap nilai dan simpan ke array
		data = new int[jumlah];
		for(int x = 0; x < data.length; x++)
		{
			System.out.print("Masukkan Data ke-"+(x+1)+" : ");	
			data[x] = scan.nextInt();
		}
		
		//	Menampilkan data sebelum di sorting
		System.out.print("\nData    : ");
		for(int x = 0; x < data.length; x++)
			System.out.print(data[x]+" ");
		
		//	Proses sorting
		sorting();
		
		//	Menampilkan Data setelah di sorting
		System.out.println();
		System.out.print("Sorting : ");
		for(int x = 0; x < data.length; x++)
			System.out.print(data[x]+" ");
		
		//	Input data yang dicari
		System.out.print("\nData yang dicari : ");		
		int cari = scan.nextInt();
		
		//	Proses Metode Pencarian Binary Searching
		System.out.println();
		boolean temu = false;
		n_awal = 0;
		n_akhir = data.length - 1;
		temp = 0;
		count = 0;
		int iterasi = 0;
		while(temu != true)
		{								
			n_tengah = (n_awal + n_akhir) / 2;
			iterasi++;
			
			//	value == cari
			if(data[n_tengah] == cari)
			{
				temu = true;
					break;
			}
			
			//	value < cari
			else if(data[n_tengah] < cari)
			{
				n_awal = n_tengah + 1;
				
			}
				
			//	value > cari
			else if(data[n_tengah] > cari)
			{
				
			}
			
			//	Cek Worst Case
			if(temp != data[n_tengah])
				temp = data[n_tengah];
			else
				count++;
			
			//	batasan untuk worst case
			if(count == 3)
				break;
		}
		
		//	Output
		if(temu == true)
			System.out.println("\nData "+cari+" ditemukan pada index ke-"+n_tengah+"\n"+
			"dan Iterasi ke-"+iterasi);
		
		else
			System.out.println("\nData "+cari+" tidak ditemukan");
			
	}
	
	//	Sorting Ascending
	public static void sorting()
	{
		int temp = 0;
		for(int x = 0; x < data.length; x++)
		{
			for(int y = 0; y < data.length; y++)
			{
				if(x == y)
					continue;
				
				else
				{
					if(data[x] < data[y])
					{
						temp = data[y];
						data[y] = data[x];
						data[x] = temp;
						
					}
				}
			}
		}
	}
 
}
