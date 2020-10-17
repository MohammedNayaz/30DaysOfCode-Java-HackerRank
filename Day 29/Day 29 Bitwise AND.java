//Day 29 Bitwise AND
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) 
    {
       int t = s.nextInt();
       for(int i=0 ; i<t ; i++)
       {
           int max = 0;
           int n = s.nextInt();
           int k = s.nextInt();
           for(int j=1 ; j<n-1 ; j++)
           {
               for(int p=j+1 ; p<=n ; p++)
               {
                   int value = j&p;
                   if(value>max && value<k)
                   {
                       max=value;
                   }
               }
           }
           System.out.println(max);
       }
        s.close();
    }
}

