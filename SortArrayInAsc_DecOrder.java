package com.bridgelabz.review.sortingproblems;
import java.util.*;

public class SortArrayInAsc_DescOrder {

        static void printOrder(int[] arr, int n)
        {
            // sorting the array
            Arrays.sort(arr);

            // printing first half in descending order
            for (int j = n - 1; j >= n / 2; j--)

                System.out.print(arr[j]+" ");

            // printing second half in ascending order
            for (int i = 0; i < n / 2; i++)

                System.out.print(arr[i]+" ");


        }

// Driver code
        public static void main(String[] args)
        {
            int[] arr = { 1,3,2,5,9,4 };
            int n = arr.length;
            printOrder(arr, n);

        }
    }

