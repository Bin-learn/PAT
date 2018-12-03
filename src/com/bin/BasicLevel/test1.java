package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/1.
 */
public class test1 {
    public static void main(String arg[]){

        //使用Scanner类获取用户输入
        Scanner s = new Scanner(System.in);
        //接收用户输入的整形数值
        int n = s.nextInt();

        //存放结果的布尔类型数组，数组长度为用户输入的数值：n
        boolean[] result = new boolean[n];

        for(int i=0; i<n; i++){
            //分别接收三个长整型数值
            long a = s.nextLong();
            long b = s.nextLong();
            long c = s.nextLong();

            //判断三个长整型数值的关系
            if(a+b>c){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        for(int i=0; i<n; i++) {
            //输出结果
            System.out.println("Case #"+(i+1)+": "+result[i]);
        }
    }
}
