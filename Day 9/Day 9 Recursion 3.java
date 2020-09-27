//Recursion 3
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{

    // Complete the factorial function below.
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int fact = scan.nextInt();  
        System.out.println(factorial(fact)); 
        //or
        //int temp = factorial(fact);
        //System.out.println(temp);
    }
    public static int factorial(int n) 
    {
        int fact = 1;
        if(n==1)
        {
            return 1;
        }
        else
        {
            for(int i=0 ; i<n ; i++)
            {
                fact = n*factorial(n-1);
            }
            return fact;
        
        }   

    }
}
