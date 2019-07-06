package ro.sda.java4.basic;

import java.util.Scanner;

public class BasicsEx6 {
    public static void main(String[] args) {
        //Create three variables, one for each type: float, byte and char.
        // Enter values corresponding to those types using Scanner. What values are you able to enterfor each type?
      Scanner scanner = new Scanner(System.in);System.out.println();
        System.out.println("Enter a float value: ");
        float a = scanner.nextFloat();
        System.out.println("Enter a byte value: ");
        byte b = scanner.nextByte();
        System.out.println("Enter a  char value: ");
        char c = scanner.next(). charAt(0);

        //print values
        System.out.println("Value for floatValue:" + a);
        System.out.println("Value for byteValue:" + b);
        System.out.println("Value for floatValue:" + c);
        //close the scanner - best practice
        scanner.close();



    }
}
