// LBP7

// Extract Digits from the number

// Implement a program to extract digits from the given number

// input -------------> a number from the user
// constraint --------> n>0
// output ------------> print digits in line sep by space


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int d;

        while (n != 0) {
            d = n % 10;
            System.out.print(d + " ");
            n = n / 10;
            
        }
    }
}
