package basicjavaprogram;

import java.util.Scanner;

public class InputValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        double pi;
        System.out.println("Input value of readus of circule: ");
        r= input.nextDouble();
        
        System.out.println("Input the value of PI: ");
        pi= input.nextDouble();
        double result= r*r*pi;
        System.out.println("The area of circle is: " +result);
    }
    
}
