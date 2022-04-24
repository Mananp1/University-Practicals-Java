/*Write a program that calculates percentage marks of the student if marks of 6 subjects are 
given.
*/

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        int marks[] = new int[7];
        int total = 0;
        float percentage = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks: ");
        for (int i = 1; i <= 6; i++) {
            marks[i] = scan.nextInt();
        }
        for (int i = 1; i <= 6; i++) {
            total = total + marks[i];
        }
        System.out.println("Total marks: "+total);
        percentage = (float) (total * 100) / 600;

        System.out.println("Students percentage = " + percentage);
    }
}
