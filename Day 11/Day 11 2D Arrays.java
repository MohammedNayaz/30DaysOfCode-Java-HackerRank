//2D Arrays
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) 
        {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) 
            {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int maximum_sum = 0;
        int temp;
        for(int i = 0; i < 4; i++) 
        {
            for(int j = 0; j < 4; j++) 
            {
                temp = 0;
                //temp = temp + arr[i][j] == temp += arr[i][j];
                // row 1
                temp += arr[i][j];
                temp += arr[i][j+1];
                temp += arr[i][j+2];

                // row 3 
                temp += arr[i+1][j+1];

                // row 2
                temp += arr[i+2][j];
                temp += arr[i+2][j+1];
                temp += arr[i+2][j+2];
                
                //if first hourglass, set as max
                if(temp > maximum_sum || i == 0 && j == 0)
                    maximum_sum = temp;
            }
        }
        System.out.println(maximum_sum);
        scanner.close();
    }
}
