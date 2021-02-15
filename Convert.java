
package basicjavaprogram;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Farenhit value: ");
        double f= input.nextDouble();
        double c= (5.0/9)* (f-32);
        System.out.println("Celceas tumpurature is : "+c);
    }
    
}
