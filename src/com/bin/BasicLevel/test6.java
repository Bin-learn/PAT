package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/6.
 */
public class test6 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();

        int c1 = sc.nextInt();

        String s2 = sc.next();

        int c2 = sc.nextInt();

        System.out.println(getTheNumber(s1,c1)+getTheNumber(s2,c2));
    }

    public static int getTheNumber(String s, int t){

        int sum = 0;

        int n = 0;

        for(int i=0; i<s.length(); i++){
            int a = (int)s.charAt(i);
            if(a == t + 48){
                n++;
            }
        }

        for(int j=n-1; j>=0; j--){
            sum = sum + t * (int)Math.pow(10,j);
        }

        return sum;
    }
}
