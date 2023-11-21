/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labonetofour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author grey-shinobi
 */
public class LabFiveActivityTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)); 
        int[] numbers = new int[10];
        
        System.out.println("Welcome to Array sorter");
        
        int index;
        int out;
        
        for (index = 0; index <= 9; index++)
        {
            System.out.print("Please enter array value"+"["+index+"] : ");
            numbers[index] = userInput.read();
//            System.out.println("\n");
           
        }
        System.out.println("User defined array values");
        for (out = 0; out == 10; out++)
        {   
            if(out < 10)
            {   
                System.out.print(numbers[out]);
                System.out.print(", ");
            }
            else
            {
                System.out.print(".");
            }
           
        }
        
    }
}
