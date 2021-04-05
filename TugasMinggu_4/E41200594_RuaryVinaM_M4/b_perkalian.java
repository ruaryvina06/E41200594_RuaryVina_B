/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasM_4;

public class b_perkalian {
    public static void main(String[] args) {
        //Case 1 Perkalian 2
        int a = 2;

        System.out.println("            Case I          ");
        System.out.println("      Perkalian 2 (1-100)   ");
        System.out.println("============================");

        System.out.print("     " + a + " ");
        do {
            a *= 2;
            if (a > 100){
                break;
            }
            System.out.print(a + " ");
        } while (a < 100);
        System.out.println("");
       
        System.out.println("============================");
        }
    }

