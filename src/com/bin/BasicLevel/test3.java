package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/4.
 */
public class test3 {
    public static void main(String args[]){
        int t = 0;
        long[] sushu = getSushu();
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        for(long i=a-1;i<b; i++){
            if(t==9){
                System.out.println(sushu[(int)i]);
                t = 0;
                continue;
            }
            if(i==b-1){
                System.out.print(sushu[(int)i]);
                break;
            }
            System.out.print(sushu[(int)i]+" ");
            t++;
        }
    }

    public static long[] getSushu(){
        long[] sushu = new long[10000];
        long t = 1;
        sushu[0] = 2;
        sushu[1] = 3;
        for(long i=5; t<10000; i+=2){
            if(i%6==1||i%6==5){
                long a = (long)Math.sqrt(i);
                for(long b = a; b>1; b--){
                    if(i%b==0){
                         break;
                    }
                    if(b == 2){
                        sushu[(int)t++] = i;
                    }
                }
            }
        }
        return sushu;
    }
}
