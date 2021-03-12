/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
import java.util.*;

public class KalkulatorSederhana {
    public static void main (String[] args){
         // a operator b
         Scanner inputUser;
         float a,b,hasil;
         char operator;
         
         inputUser = new Scanner(System.in);
         
         System.out.print("nilai a= ");
         a = inputUser.nextFloat();
         System.out.print("operator= ");
         operator = inputUser.next().charAt(0);
         System.out.print("nilai b= ");
         b = inputUser.nextFloat();
         
         System.out.println("input user:" + a + " " + operator + " " + b);
         
         // operator tersedia * / + -
         
         if (operator == '+'){
             // penjumlahan
             hasil = a + b;
             System.out.println("hasil = " + hasil);
        } else if  (operator == '-'){
             // pengurangan
             hasil = a - b;
             System.out.println("hasil = " + hasil);
        } else if  (operator == '*'){
             // perkalian
             hasil = a * b;
             System.out.println("hasil = " + hasil);
        } else if  (operator == '/'){
             // pembagian
             hasil = a / b;
             System.out.println("hasil = " + hasil);
        } else {
            System.out.println("operasi tidak ditemukan");
        }
    }
}
