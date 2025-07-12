// LBP3
// To check whether the given year is leap year or not.

// input------> year from the user
// constraint-> no constraint............Year>0
//             Leap Year: It is exactly divisible by 4 except for century year, if it is a century year then it must be divisible by 400.

// output-----> leap year or not leap year (True or False)

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int y = obj.nextInt();

        if ((y%4 == 0 && y%100 != 0) || (y%400 == 0)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        obj.close();
    }
}
