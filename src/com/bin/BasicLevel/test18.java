package com.bin.BasicLevel;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/13.
 */

//测试超时
public class test18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p = sc.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<N; i++){
            for(int j=i; j>=0&&a[i]<=a[j]*p; j--){
                b[i]++;
            }
        }
        Arrays.sort(b);
        System.out.println(b[N-1]);
    }
}
