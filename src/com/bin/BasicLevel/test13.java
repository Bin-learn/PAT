package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/12.
 */
public class test13 {
    public static void main(String args[]){
        int a[] = new int[10];
        boolean t = true;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            a[i] = sc.nextInt();
        }
        if(a[0]==0){
            for(int i=1; i<10; i++){
                for(int j=0; j<a[i]; j++){
                    System.out.print(i);
                }
            }
        }else{
            for(int i=1; i<10; i++){
                for(int j=0; j<a[i]; j++){
                    System.out.print(i);
                    if(t){
                        for(int k=0; k<a[0]; k++){
                            System.out.print("0");
                        }
                        t =false;
                    }
                }
            }
        }

    }


}
