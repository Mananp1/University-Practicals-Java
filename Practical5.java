/*Write a program that reads a number in meters, converts it to feet, and displays the result.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in meters: ");
        double meters = input.nextDouble();
        double feet = (double) (meters*3.28084);
        System.out.println(meters+"m = "+feet+"ft");
    }
}
