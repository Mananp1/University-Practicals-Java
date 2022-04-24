/* Write a program to find length of string and print second half of the string. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = input.next();
        int l = str.length();
        System.out.println("Length of the string "+str+" is "+l);
        System.out.println("Your sub String is:"+str.substring(l/2));
    }
}
