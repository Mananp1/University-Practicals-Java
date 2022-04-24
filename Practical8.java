/* Write a program that prompts the user to enter a letter and check whether a letter is a 
vowel or constant.
*/

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        char chl = Character.toLowerCase(ch);
            if (chl == 'a' || chl == 'e' || chl == 'i' || chl == 'o' || chl == 'u') {
                System.out.println(ch + " is vowel");
            }
            else {
                System.out.println(ch + " is consonant");
            }
    }
}
