// LBP9

// Sum of even Digits 

// Implement a program to calculate sum of even digits present in the given number

// input -------------> a number from the user
// constraint --------> n>0
// output ------------> print sum of even digits

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int s = 0;
        int d;

        while (n != 0) {
            d = n % 10;
            if (n % 2 == 0){
                s = s + d;
            }
            n = n / 10;
        }
        System.out.println(s);
    }
}
