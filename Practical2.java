/*Write a program to convert rupees to dollar. 70 rupees=1 dollar. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int rupees = convert.nextInt();
        float dollers = (float)(rupees/70.0);
        System.out.println("" +rupees+"= "+dollers+"$");
    }
}
