package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/12.
 */
public class test11 {
    public static void main(String args[]){
        int count[] = new int[10];
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        for(int i=0; i<N.length(); i++){
            count[(int)N.charAt(i)-48]++;
        }
        for(int i=0; i<10; i++){
            if(count[i]!=0){
                print(i, count[i]);
            }
        }
    }

    public static void print(int a, int b){
        System.out.println(a+":"+b);
    }
}
