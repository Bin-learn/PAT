package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/4.
 */
public class test4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String lines[] = new String[4];
        char day = 'A';
        char hour = '0';
        String minute = "00";
        int length[] = new int[4];
        int flag1 = 0;
        for (int i=0; i<4; i++){
            lines[i] = sc.nextLine();
            length[i]  = lines[i].length();
        }
        int length1 = length[0]>length[1]? length[1]:length[0];
        int length2 = length[2]>length[3]? length[3]:length[2];
        //判断日期和小时
        for (int i=0; i<length1; i++){
            char c1 = lines[0].charAt(i);
            char c2 = lines[1].charAt(i);
            if(c1 == c2 ){
                if(flag1==1) {
                    hour = c1;
                    break;
                }
                if(flag1==0 && Character.isUpperCase(c1)){
                    day = c1;
                    flag1 = 1;
                }
            }
        }
        //判断分钟
        for (int j=0; j<length2; j++){
            char c3 = lines[2].charAt(j);
            char c4 = lines[3].charAt(j);
            if(c3 == c4 && Character.isLetter(c3)){
                if(j<10){
                    minute = "0"+j;
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
