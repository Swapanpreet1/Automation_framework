package com.anagram.java;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;



/**
 * Created by swapanpreetkaur on 2/5/17.
 */
public class anagram
{


    public String str1 = "", str2 = "", str3 = "";


    public static void main(String[] args) throws IOException {

        anagram as = new anagram();


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("enter str 1:");
            as.str1 = br.readLine();
            System.out.print("enter str 2:");
            as.str2 = br.readLine();
            System.out.print("enter str 3:");
            as.str3 = br.readLine();

            boolean result1 = as.anagram(as.str1, as.str2);
            boolean result2 = as.anagram(as.str2, as.str3);
            boolean result3 = as.anagram(as.str1, as.str3);
            System.out.println("str and str are anagram -> " + result1);
            System.out.println("str2 and str3 are anagram -> " + result2);
            System.out.println("str1 and str3 are anagram -> " + result3);
        } catch (Exception e) {
            System.out.println("exception caught");
        }
    }

    public boolean anagram(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        boolean f=true;
        if (n != m) {
            return false;
        }
        char arr1[] = s1.toCharArray();
        sort(arr1);

        char arr2[] = s2.toCharArray();
        sort(arr2);
        for(int j=0;j<n;j++)
        {

            if(arr1[j]!=arr2[j])
                f=false;


        }
        return f;

    }
    static public void sort(char[] arr) {
        int n = arr.length;
        int temp = 0;

        for (int i = 0; i < n; i++)
            for (int j = 1; j < (n - i); j++)
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = (char) temp;
                }
    }
}
}
