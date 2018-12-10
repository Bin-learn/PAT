package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/4.
 */
public class test4 {
    public static void main(String args[]){

        //初始化数组lines，用于保存用户即将输入的四条字符串
        Scanner sc = new Scanner(System.in);
        String lines[] = new String[4];

        //初始化时间
        char day = 'A';
        char hour = '0';
        String minute = "00";

        //初始化length数组，分别用于保存用户即将输入的四条字符串的长度
        int length[] = new int[4];

        //标记
        int flag1 = 0;

        //保存字符串及其对应长度
        for (int i=0; i<4; i++){
            lines[i] = sc.nextLine();
            length[i]  = lines[i].length();
        }

        //获得需要对比的字符串中较短的那条的字符长度
        int length1 = length[0]>length[1]? length[1]:length[0];
        int length2 = length[2]>length[3]? length[3]:length[2];

        //判断日期和小时
        for (int i=0; i<length1; i++){

            //使用c1、c2分别保存前两个字符串的第i位字符
            char c1 = lines[0].charAt(i);
            char c2 = lines[1].charAt(i);

            //判断两个字符是否相等
            if(c1 == c2 ){

                //找到小时数，退出循环体
                if(flag1==1) {
                    hour = c1;
                    break;
                }

                //如果字符相等，则判断flag1是不是等于0且相等的字符是不是大写的。
                //全部满足则该字符表示星期几
                if(flag1==0 && Character.isUpperCase(c1)){
                    day = c1;

                    //将flag1置为1，表示已经找到星期几
                    flag1 = 1;
                }
            }
        }

        //判断分钟
        for (int j=0; j<length2; j++){
            char c3 = lines[2].charAt(j);
            char c4 = lines[3].charAt(j);
            if(c3 == c4 && Character.isLetter(c3)){

                //如果分钟数小于10则在前面加个0，比如：01、02
                if(j<10){
                    minute = "0"+j; //String类型加整形，自动转换成String类型
                }else{
                    minute = String.valueOf(j);
                }
                break;
            }
        }
        //输出日期
        switch(day){
            case 'A': System.out.print("MON "); break;
            case 'B': System.out.print("TUE "); break;
            case 'C': System.out.print("WED "); break;
            case 'D': System.out.print("THU "); break;
            case 'E': System.out.print("FRI "); break;
            case 'F': System.out.print("SAT "); break;
            case 'G': System.out.print("SUN "); break;
        }

        //输出小时数，isLetter判断字符是否为字母、isUpperCase判断字符是否为大写、
        //isDigit判断字符是否为数字
        if(Character.isLetter(hour)){
            if(Character.isUpperCase(hour)){
                System.out.print(hour-'A'+10);
            }else{
                System.out.print(hour-'a'+10);
            }
        }else if(Character.isDigit(hour)){
            System.out.print("0"+hour);
        }

        //输出分钟
        System.out.print(":"+minute);
    }
}
