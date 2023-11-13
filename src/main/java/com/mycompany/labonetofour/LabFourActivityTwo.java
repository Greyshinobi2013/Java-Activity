/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labonetofour;

/**
 *
 * @author grey-shinobi
 */
public class LabFourActivityTwo {
    public static void main(String[] args)
    {
        //Lab four second activity
        //for loop
        System.out.println("For loop\n");
        for(int i = 0; i <15; i ++){
            System.out.println( (i + 1) +" Blh Tech");
        }
        //while loop
        System.out.println("\nWhile loop\n");
        int j = 0;
        while(j < 15){
            System.out.println((j + 1) +" Blh Tech");
            j++;
        }
        
        //do...while loop
        System.out.println("\ndo...while loop\n");
        int n = 0;
        do{ 
            System.out.println( (n + 1) + " Blh Tech");
            n++;
        }while(n < 15);
    }
}
