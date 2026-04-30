/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pb;

import java.util.Scanner;

/**
 *
 * @author MAHASISWA
 */
public class PB {

    /**
     * @param args the command line arguments
     */
           public static void main(String[] args){
           int i, j, k;

           int[][][] data_jual = {
               
           {{100, 200, 300},
           {150, 240, 360},
           {250, 340, 460},
           {250, 340, 460}},
               
           {{160, 250, 365},
           {175, 275, 375},
           {275, 375, 575},
           {380, 480, 580}}
                   
           };

           System.out.println();
           System.out.println("Data Penjualan Pertahun");
           System.out.println("-------------------------------------- ");
           System.out.println();
           System.out.println("Tahun Hasil Tahun Penjualan Ke. ");
           System.out.println();
           System.out.println("Ke.  Ke. --------------------");
           System.out.println();
           System.out.println("                         1        2 ");
           System.out.println("--------------------------------------");
           System.out.println();

           for(i=0;i<2;i++){
           for(j=0;j<3;j++){
           System.out.print((i+1) + "\t");
           System.out.print((j+1) + "\t\t");
           for(k=0;k<2;k++){
           System.out.print(data_jual[i][j][k]);
           System.out.print("\t");
           }
           System.out.println();
           }
           System.out.println();
           }
           System.out.println("--------------------------------------");
           System.out.println();
           }
           
           
           
         
}



