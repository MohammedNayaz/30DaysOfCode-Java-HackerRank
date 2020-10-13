//Day 25 Running Time and Complexity
import java.util.*;

public class Solution 
{
    
    public static boolean isPrime(int n)
    {
        // check lower boundaries on primality
        if( n == 2 )
        { 
            return true;
        }
        // 1 is not prime, even numbers > 2 are not prime
        else if( n == 1 || (n & 1) == 0)
        {
            return false;
        }

        // Check for primality using odd numbers from 3 to sqrt(n)
        for(int i = 3; i <= Math.sqrt(n); i += 2)
        {
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 )
            { 
                return false;
            }
        }
        // n is prime
        return true;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i = 0; i < testCases; i++)
        {
            System.out.println((isPrime(scan.nextInt()) ? "Prime" : "Not prime") );
        }
        scan.close();
    }
}