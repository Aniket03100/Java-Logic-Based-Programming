// LBP11

// Sum of prime Digits 

// Implement a program to calculate sum of prime digits present in the given number

// input -------------> a number from the user
// constraint --------> n>0
// output ------------> print sum of prime digits

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int s, d;
        s = 0;

        while(n != 0)
        {
            d = n % 10;
            if(d == 2 || d == 3 || d == 5 || d == 7){
                s = s + d;
            }
            n = n / 10;
        }
        System.out.println(s);
    }
}
