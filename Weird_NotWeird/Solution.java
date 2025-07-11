// LBP2
// Given an integer n, perform the following conditional actions,
// if n is odd, print weird,
// if n is even and in the inclusive range of 2 to 5, print Not Weird.
// if n is even and in the inclusive range of 6 to 20, print Weird.
// if n is even and greater than 20, print Not Weird.

// input-----> a number from the user
// contraint-> 1<=n<=100
// output----> Weird or Not Weird





import java.util.Scanner;

public class Solution {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        if (n%2 != 0){
            System.out.println("Weird");
        }
        else{
            if (n>=2 && n<=5)
            System.out.println("Not Weird");
            
            else if (n>=6 && n<=20)
            System.out.println("Weird");

            else
            System.out.println("Not Weird");
        }

        obj.close();
    }
}
