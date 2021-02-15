
package basicjavaprogram;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){
    double pi= 3.1416;
    Scanner input = new Scanner(System.in);
        System.out.print("Enter the redius of a cylinder: ");
        double r= input.nextDouble(); 
        System.out.print("Enter the length of a cylinder: ");
        double l= input.nextDouble();
        
        double area= r*r*pi;
        double volume = area*l;
        
        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
    }
}
