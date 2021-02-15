
package basicjavaprogram;

import java.util.Scanner;

public class Avarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input  three numbers : ");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        
        int s= a+b+c;
        
        System.out.println("Avarage = "+ s);
    }
}
