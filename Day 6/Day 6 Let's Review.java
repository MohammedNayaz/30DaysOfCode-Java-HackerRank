//Let's Review
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String str[] = new String[n];
    for(int i = 0; i<n; i++)
    {
        str[i] = s.next();
    }
    for(int temp = 0; temp<n; temp++)
    {

        for(int j = 0; j<str[temp].length(); j = j+2)
        {
            System.out.print(str[temp].charAt(j));
        }
        System.out.print(" ");

        for(int j = 1; j<str[temp].length(); j = j+2)
        {
            System.out.print(str[temp].charAt(j));
        }

        System.out.println();

    }
    s.close();
    }
    
    
}


