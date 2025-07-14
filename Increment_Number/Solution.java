// LBP5

// Return the Next Number from the Integer Passed

// implement a program that takes a number as an argument, increments the number by +1 and returns the result

// input ----------> a number from the user
// constraints-----> no constraints
// output ---------> an incremented value

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        System.out.println(++n);
    }

    
}
