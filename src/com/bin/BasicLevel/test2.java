package com.bin.BasicLevel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/1.
 */
public class test2 {
    public static void main(String args[]){
        long A1 = 0, A2 = 0, A3 = 0, A5 = 0, AA4 = 0, AAA4 = 0, AA2 = 0;
        double  AAAA4 = 0;
        String A4 = "N";
        DecimalFormat d = new DecimalFormat(".#");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i=0; i<N; i++){
            long a = s.nextLong();
            if(a%5==0){
                if(a%2==0){
                    A1 =A1 +a;
                }
            }else if(a%5==1){
                if(AA2 == 0){
                    A2 =  A2 + a;
                    AA2 = 1;
                }else{
                    A2 =  A2 - a;
                    AA2 = 0;
                }
            }else if(a%5==2){
                A3++;
            }else if(a%5==3){
                AA4 = AA4 + a;
                AAA4++;
            }else if(a%5==4){
                if(i==0){
                    A5 = a;
                }
                if(A5 < a){
                    A5 = a;
                }
            }
            if(AAA4!=0){
                AAAA4 =  (double)AA4/AAA4;
            }
            if(AAAA4 != 0){
                A4 = d.format(AAAA4);
            }
        }
        System.out.println(changeToString(A1)+" "+changeToString(A2)+" "+changeToString(A3)+" "+A4+" "+changeToString(A5));
    }
    public static String changeToString(long A){
        if(A == 0){
            return "N";
        }else{
            return Long.toString(A);
        }
    }
}
