/*Write a program to count the number of words that start with capital letters*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("No of Capital Letters in entered string:" + count);
    }
}
