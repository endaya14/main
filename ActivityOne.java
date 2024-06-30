/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class ActivityOne {
    public void checkInput(int num){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputX = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = inputX.nextInt();
        String message;
        if (num == 0) {
            System.out.println("You entered 0");
        } else {
            message = (num % 2 == 0) ? num + " is even number" : num + " is odd number";
            System.out.println(message);
            if (num > 0) {
                System.out.println("Positive Number");
            } else if (num < 0) {
                System.out.println("Negative Number");
            } 
        }
        
       
        String check = "";
        
        StringBuilder sb = new StringBuilder(check);
        System.out.println((check.equals(sb.reverse().toString()))?"Palin":"Not Palin");
       
        
        
       
           }
    
}
