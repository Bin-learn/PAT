package com.bin.BasicLevel;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/6.
 */
public class test7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();

        BigInteger B = sc.nextBigInteger();

        BigInteger Q = A.divide(B);

        BigInteger R = A.remainder(B);

        System.out.println(Q+" "+R);
    }
}
