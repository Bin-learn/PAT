package com.bin.BasicLevel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/1.
 */
public class test2 {
    public static void main(String args[]){

        /*
        * A1:保存问题描述中A1的结果
        * A2:保存问题描述中A2的结果
        *    A2Flag:用来判断奇偶数项，从而决定'+'和'-'符号
        * A3:保存问题描述中A3的结果
        * A4:保存问题描述中A4的结果
        *    A4Sum:用来表示符合A4的各项之和
        *    A4Count：用来表示符合A4的项数
        *    A4PreliminaryResult：用来表示A4的初步、未格式化的结果
        * A5:保存问题描述中A5的结果
        * */
        long A1 = 0, A2 = 0, A3 = 0, A5 = 0, A4Sum = 0, A4Count = 0, A2Flag = 0;
        double  A4PreliminaryResult = 0;
        String A4 = "N";

        //使用DecimalFormat类使结果格式化：".#"表示保留一位小数，实例化该类，生成对象d。
        DecimalFormat d = new DecimalFormat(".#");

        //用户输入N
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        //循环获取用户输入的数字，每次循环都对A1-A5进行更新
        for(int i=0; i<N; i++){

            //获取用户输入的数字
            long a = s.nextLong();

            //根据A1-A5的条件进行判断
            if(a%5==0){
                if(a%2==0){
                    A1 =A1 +a;
                }
            }else if(a%5==1){
                if(A2Flag == 0){
                    A2 =  A2 + a;
                    A2Flag = 1;
                }else{
                    A2 =  A2 - a;
                    A2Flag = 0;
                }
            }else if(a%5==2){
                A3++;
            }else if(a%5==3){
                A4Sum = A4Sum + a;
                A4Count++;
            }else if(a%5==4){
                if(i==0){
                    A5 = a;
                }
                if(A5 < a){
                    A5 = a;
                }
            }

            //计算A4的初步结果：总和/项数
            if(A4Count!=0){
                A4PreliminaryResult =  (double)A4Sum/A4Count;
            }

            //将初步结果格式化，得到最终结果（保留一位小数）
            if(A4PreliminaryResult != 0){
                A4 = d.format(A4PreliminaryResult);
            }
        }

        //输出最终结果，并调用changeToString函数，将结果为0的项用字符'N'表示
        System.out.println(changeToString(A1)+" "+changeToString(A2)+" "+changeToString(A3)+" "+A4+" "+changeToString(A5));
    }

    //将所有为0的结果用'N'表示
    public static String changeToString(long A){
        if(A == 0){
            return "N";
        }else{
            return Long.toString(A);
        }
    }
}
