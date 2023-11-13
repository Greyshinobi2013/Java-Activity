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
public class LabFourActivityOne {

    public static void main(String[] args) {
        //Lab four One.One activity
        BufferedReader forthInput = new BufferedReader(new InputStreamReader(System.in));
        int exam_1 = 0, exam_2 = 0, exam_3 = 0;
        try {
            System.out.print("Enter exam one: ");
            exam_1 = Integer.parseInt(forthInput.readLine());
            System.out.print("Enter exam two: ");
            exam_2 = Integer.parseInt(forthInput.readLine());
            System.out.print("Enter exam three: ");
            exam_3 = Integer.parseInt(forthInput.readLine());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        double exam_average = (exam_1 + exam_2 + exam_3) / 3;
        if (exam_average >= 60) {
            System.out.println("Average = " + exam_average + ":-)");
        } else {
            System.out.println("Average = " + exam_average + ":-(");

        }
    }
}
