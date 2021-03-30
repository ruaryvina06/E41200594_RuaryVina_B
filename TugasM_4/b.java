/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasM_4;


public class b {
    public static void main(String[] args) {
        int nilai = 0;                                 
        System.out.println("Do While");
        System.out.println("Kelipatan dua dari 0- 100");
        System.out.println("==========");
        do {                                       
            nilai++;                                   
            if (nilai % 2 == 0) {                      
                System.out.println(nilai);             
            }
        } while (nilai <= 100);                         
    
    }
}
