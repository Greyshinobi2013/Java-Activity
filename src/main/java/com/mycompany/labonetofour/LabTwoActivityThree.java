
package com.mycompany.labonetofour;

/**
 *
 * @author grey-shinobi
 */
public class LabTwoActivityThree {
    public static void main(String[] args) {
        //Lab two third activity
        int word_1 = 10;
        int word_2 = 23;
        int word_3 = 5;
        //compare word_1 and word_2 by using ternary operator
        int maxNumberOfTwo = (word_1 < word_2) ? word_2 : word_1;
        
        //compare maxNumberOfTo and word_3 by using ternary operator
        int maxNumberOfThree = (maxNumberOfTwo < word_3) ? word_3 : maxNumberOfTwo;
        System.out.println("number_1 = " + word_1);
        System.out.println("number_2 = " + word_2);
        System.out.println("number_3 = " + word_3);
        System.out.println("The highest number is = " + maxNumberOfThree);
    }
}
