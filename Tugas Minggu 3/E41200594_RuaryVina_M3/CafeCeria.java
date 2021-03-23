
package TugasM_3;
import java.util.Scanner;
public class CafeCeria {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        String nama;
        int menu;
        System.out.println("               Cafe Ceria             ");
        System.out.println("             Aneka Minuman            ");
        System.out.println("--------------------------------------");
        System.out.println("             Spesial Menu :           ");
        System.out.println("             1. Soft Drinks           ");
        System.out.println("             2. Mix Juice             ");
        System.out.println("             3. Nescafe               ");
        System.out.println("             4. Soda Milk             ");
        System.out.println("             5. Tea                   ");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = masukkan.nextLine();
        System.out.println(" ");
        System.out.print("Silahkan masukkan pilihan anda : ");
        menu = masukkan.nextInt();
         if (menu == 1){
            System.out.println("Minuman yang anda pesan adalah Soft Drinks");
         }else if(menu == 2){
            System.out.println("Minuman yang anda pesan adalah Mix Juice");
         } else if(menu == 3){
            System.out.println("Minuman yang anda pesan adalah Nescafe");
         }else if(menu == 4){
            System.out.println("Minuman yang anda pesan adalah Soda Milk");
         }else if(menu == 5){
            System.out.println("Minuman yang anda pesan adalah Tea");
         }else{
                System.out.println("Menu Tidak Tersedia");
        }
        System.out.println("Pesanan akan segera diantar");
        System.out.println("Teimakasih " + nama + "telah berkunjung diCafe Ceria");
    }
}
