//Day 27 Testing
import java.util.*;

public class Solution {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    static class TestDataEmptyArray 
    {
        public static int[] get_array() 
        {
            // complete this function
            int[] arr = {};
            return arr;
        }
    }

    static class TestDataUniqueValues 
    {
         static int[] arr = {1,2,3,4};
        public static int[] get_array() 
        {
            // complete this function
            return arr;
        }

        public static int get_expected_result() 
        {
            // complete this function
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums 
    {
        static int[] arr = {0,0,1};
        public static int[] get_array() 
        {
            // complete this function
            return arr;
        }

        public static int get_expected_result() 
        {
            // complete this function
            return 0;
        }
    }

    