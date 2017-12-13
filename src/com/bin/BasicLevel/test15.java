package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/13.
 */
public class test15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), t = 1, T = 0, r, count = 0;
        String s = sc.next();
        char c = s.charAt(0);
        for(int i=1; t<=n; i++){
            T = t;
            t = t+4*i+2;
            count = i;
        }
        r = n - T;
        for(int i=count; i>0; i--){
            for(int j=0; j<(count-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print(c);
            }
            System.out.println("");
        }
        for(int i=1; i<count; i++){
            for(int j=0; j<count-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print(c);
            }
            System.out.println("");
        }
        System.out.println(r);
    }
}
