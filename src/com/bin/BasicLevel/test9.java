package com.bin.BasicLevel;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by  bin
 * Time： 2017/12/8.
 */
public class test9 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int t[] = {6, 1, 7, 4};

        int a[]  = changeNumToArray(num, 4);

        int totalC = 0;

        if(a[1] == a[2] && a[3] == a[0] && a[0] == a[1]){
            System.out.println(num+" - "+num+" = "+"0000");
            totalC = 6174;
        }

        while(totalC != 6174){
            Arrays.sort(a);
            int b[] = reverse(a, a.length);
            totalC = sub(a, b);
            print(b);
            System.out.print(" - ");
            print(a);
            System.out.print(" = ");
            int c[] = changeNumToArray(totalC, 4);
            print(c);
            System.out.println("");
            System.arraycopy(c, 0, a, 0, 4);
        }
    }


    public static int[] changeNumToArray(int num, int length){
        int a[] = new int[length];
        for(int i=0; i<length; i++){
            a[i] = num%10;
            num = num/10;
        }
        a = reverse(a, a.length);
        return a;
    }

    public static int[] reverse(int[] a, int length){
        int b[] = new int[length];
        for(int i=0; i<length; i++){
            b[length-1-i] = a[i];
        }
        return b;
    }

    public static int sub(int[] a, int[] b){
        int totalC;
        int totalA = 0;
        int totalB = 0;
        for(int i=0; i<a.length; i++){
            totalA = totalA + a[i]*(int)Math.pow(10,a.length-1-i);
            totalB = totalB + b[i]*(int)Math.pow(10,a.length-1-i);
        }
        totalC = totalB - totalA;
        return totalC;
    }

    public static void print(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}

/*
* 网上简短做法
*
链接：https://www.nowcoder.com/questionTerminal/2e6a898974064e72ba09d05a60349c9e
来源：牛客网

import java.util.Arrays;
import java.util.Scanner;
   
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[4];
        do {
            for(int i=0;i<4;i++){
                a[i]=n%10;
                n/=10;
            }
            Arrays.sort(a);
            int high=0,low=0;
            for(int i=0;i<4;i++){//取最大值
                high+=a[3-i]*Math.pow(10, 3-i);
            }
            for(int i=0;i<4;i++){//取最小值
                low+=a[i]*Math.pow(10, 3-i);
            }
            n=high-low;
            System.out.printf("%04d - %04d = %04d\n",high,low,n);
            if(n==0){              
                return ;
            }          
        } while(n!=6174) ;     
    }
}
* */
