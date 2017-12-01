package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/1.
 */
public class test1 {
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] result = new boolean[n];
        for(int i=0; i<n; i++){
            long a = s.nextLong();
            long b = s.nextLong();
            long c = s.nextLong();
            if(a+b>c){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.println("Case #"+(i+1)+": "+result[i]);
        }
    }
}
