/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaltest;

/**
 *
 * @author Yenuka Sandeepa
 */
public class Soundex {
    
    public static String getGode(String y) 
    {
        char[] a = y.toUpperCase().toCharArray();
         
         
        char firstLetter = a[0];
 
        //Question 1
        //Replace consonants with digits
        for (int j = 0; j < a.length; j++) {
            switch (a[j]) {
            case 'B':
            case 'F':
            case 'P':
            case 'V': {
                a[j] = '1';
                break;
            }
 
            case 'C':
            case 'G':
            case 'J':
            case 'K':
            case 'Q':
            case 'S':
            case 'X':
            case 'Z': {
                a[j] = '2';
                break;
            }
 
            case 'D':
            case 'T': {
                a[j] = '3';
                break;
            }
 
            case 'L': {
                a[j] = '4';
                break;
            }
 
            case 'M':
            case 'N': {
                a[j] = '5';
                break;
            }
 
            case 'R': {
                a[j] = '6';
                break;
            }
 
            default: {
                a[j] = '0';
                break;
            }
            }
        }
 
        
        //Remove all non-digits 
        //Question 3
        String output = "" + firstLetter;
         
        //Question 2
        for (int j = 1; j < a.length; j++)
            if (a[j] != a[j - 1] && a[j] != '0')
                output += a[j];
 
        //Question 4
        output = output + "0000";
        return output.substring(0,4);
    }
    
}
