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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String surname1 = "Robert";
        String surname2 = "Rupert";
        String surname3 = "Rubin";
        String surname4 = "Ashcraft";
         
        System.out.println(Soundex.getGode(surname1));
        System.out.println(Soundex.getGode(surname2));
        System.out.println(Soundex.getGode(surname3));
        System.out.println(Soundex.getGode(surname4));
        
    }
    
}
