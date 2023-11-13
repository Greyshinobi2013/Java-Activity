/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labonetofour;

import javax.swing.JOptionPane;

/**
 *
 * @author grey-shinobi
 */
public class LabFourActivityOneTwo {
    public static void main(String[] args) {
        //Lab four activity One.Two
        int exam_41 = 0, exam_42 = 0, exam_43 = 0;

        exam_41 = Integer.parseInt(JOptionPane.showInputDialog("Enter exam_1"));
        exam_42 = Integer.parseInt(JOptionPane.showInputDialog("Enter exam_2"));
        exam_43 = Integer.parseInt(JOptionPane.showInputDialog("Enter exam_3"));
        int totalAverage = (exam_41 + exam_42 + exam_43) / 3;
        if(totalAverage >= 60){
            JOptionPane.showMessageDialog(null,"Average = " + totalAverage + ":-)");
            }
        else{
            JOptionPane.showMessageDialog(null,"Average = " + totalAverage + ":-(");
        }
    }
    
}
