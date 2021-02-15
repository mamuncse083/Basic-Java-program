
package basicjavaprogram;

import java.util.Scanner;

public class PoundsIntoKilograms {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x= 0.454;
        System.out.print("Enter a number in pounds:");
        double p= input.nextDouble();
        double c= x*p;
        System.out.println(p+" pounds is "+c+" kilograms");
        
    }
}