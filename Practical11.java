/*Write a program to find that given number or string is palindrome or not.
 */

public class Main {
    public static void main(String[] args) {
        String str = "Radar";
        String reverseStr = "";
        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
