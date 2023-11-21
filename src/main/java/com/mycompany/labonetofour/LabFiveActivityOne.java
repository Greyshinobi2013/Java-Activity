/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labonetofour;

/**
 *
 * @author grey-shinobi
 */
public class LabFiveActivityOne {

    public static void main(String[] args) {

        String[] days = new String[7];
        days[0] = "Monday";   //position 0
        days[1] = "Tuesday";  //positon 1
        days[2] = "Wednsday"; //position 2
        days[3] = "Thursday"; //position 3
        days[4] = "Frieday";  //position 4
        days[5] = "Satursday"; //position 5
        days[6] = "Sunday";    //position 6
        int index;
        for (index = 0; index < 7; index++) {

            System.out.print(days[index]);
            if (index < 6) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }

        }
        //for-each values
        for( String day: days)
        {
            System.out.println(day + ", ");
        }
        //while
        
        
        //do..while
    }

}
