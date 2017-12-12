package com.bin.BasicLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/12.
 */
public class test12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int D = sc.nextInt();
        change(A+B, D);
    }

    public static void change(int a, int d){
        int x = a;
        long y = 0;
        List<Integer> c = new ArrayList<Integer>();
        while(x!=0){
            c.add(x%d);
            x = x/d;
        }
        for(int i=c.size()-1; i>=0; i--){
            System.out.print(c.get(i));
        }
    }
}
