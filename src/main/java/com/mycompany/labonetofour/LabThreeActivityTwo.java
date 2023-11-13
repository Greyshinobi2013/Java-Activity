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
public class LabThreeActivityTwo {
    public static void main(String[] args) {
        //Lab three second activity
        String word_1 = JOptionPane.showInputDialog("Enter word1");
        String word_2 = JOptionPane.showInputDialog("Enter word2");
        String word_3 = JOptionPane.showInputDialog("Enter word3");

        //concatinate word_1, word_2 and word_3
        String statement = word_1 + " " + word_2 + " " + word_3;
        JOptionPane.showMessageDialog(null, statement);
    }
    
}
