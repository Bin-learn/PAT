package com.bin.BasicLevel;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/13.
 */
public class test18_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p = sc.nextInt();
        int a[] = new int[N];
        int maxLen = 0;
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<N; i++){
            for(int j=i-maxLen; j>=0&&a[i]<=a[j]*p; j--){
                maxLen++;
            }
        }
        System.out.println(maxLen);
    }
}
