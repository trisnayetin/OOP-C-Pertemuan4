/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aray1dimensi;

import java.util.Scanner;

/**
 *
 * @author Yetin
 * TGL: 12 April 2025
 */
public class Aray1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] NMA = new String [5];
       
       NMA[0]="Ellda";
       NMA[1]="Yetin";
       NMA[2]="Nurul";
       NMA[3]="Enjel";
       NMA[4]="Rolan";
       

       Scanner inp = new Scanner (System. in);
       System.out.println("~~~~~Input Data Ke Aray~~~~~");
       for (int idx=0; idx<5; idx++){
           System.out.printf("Data Nama Pengunjung ke-%d: ",idx+1);
           NMA [idx] = inp.nextLine();
       }
       System.out.println("~~~~~Output Data Ke Aray~~~~~");
       for (int idx=0; idx<5; idx++){
    System.out.println("Data Nama Pengunjung ke-"+(idx+1)+": "+NMA [idx]);
    
       }
       System.out.println("~~~~~Output2 Data Ke Aray~~~~~");
       int no=1;
       for (String isi : NMA){
           System.out.println(no+","+isi);
           no++;E 
       }
    }
    
}
