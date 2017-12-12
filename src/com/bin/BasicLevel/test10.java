package com.bin.BasicLevel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/12.
 */
public class test10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.00");

        int N = sc.nextInt(), Count = 0, t;
        double Total = 0;

        int D = sc.nextInt();

        int count[] = new int[N];

        int total[] = new int[N];

        double single[] = new double[N];

        for(int i=0; i<N; i++){
            count[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            total[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
            single[i] = (double)total[i]/count[i];
        }
        sort(count, total, single);
        for(t=0; Count<D; t++){
            Count = Count + count[t];
        }
        for(int i=0; i<t-1; i++){
            Total = Total + total[i];
        }
        Total = Total + (D-Count+count[t-1])*single[t-1];
        System.out.println(d.format(Total));
    }

    public static void sort(int count[], int total[], double single[]){
        for(int i=0; i<count.length; i++){
            int max = i;
            for(int j=i; j<count.length; j++){
                if(single[j]>single[max]){
                    max = j;
                }
            }
            int t1 = count[max];
            count[max] = count[i];
            count[i] = t1;
            int t2 = total[max];
            total[max] = total[i];
            total[i] = t2;
            double t3 = single[max];
            single[max] = single[i];
            single[i] = t3;
        }
    }
}
