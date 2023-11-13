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
public class LabThreeActivityOne {

    public static void main(String[] args) {
        //Lab three first activity
        BufferedReader stringInput = new BufferedReader(new InputStreamReader(System.in));
        
        //declare and initialize word_1, word_3 and word_3
        String word_1 = "", word_2 = "", word_3 = "";

        try {
            System.out.print("Enter word1: ");

            word_1 = stringInput.readLine();
            System.out.print("Enter word2: ");
            word_2 = stringInput.readLine();
            System.out.print("Enter word3: ");
            word_3 = stringInput.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        System.out.println(word_1 + " " + word_2 + " " + word_3);
    }
}
