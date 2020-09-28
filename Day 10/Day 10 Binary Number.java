//Binary Number
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int num=0, x=0, y=0;
        while(n>0)
        {
            num=n%2;
            n=n/2;
            if(num==1)
            {   
                x++;
                if(x>=y)

                    y=x;

            }
            else
            {
                x=0;
            }  
        }     
        System.out.println(y);
        scanner.close();
    }
}
