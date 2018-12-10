package com.bin.BasicLevel;

import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/4.
 */
public class test3 {
    public static void main(String args[]){

        //用于判断输出是否需要换行(t的值0--9表示一行输出的九个数)
        int t = 0;

        //按题目要求输入数据
        Scanner s = new Scanner(System.in);
        int M = s.nextInt();
        int N = s.nextInt();

        //调用写好的函数getSushu()获取素数数组
        int[] sushu = getSushu(N);

        //按每行10个数字的格式输出结果
        for(int i=M-1;i<N; i++){

            //当t等于9时，需要换行，所以用continue让程序进入下一次循环
            if(t==9){
                System.out.println(sushu[i]);
                t = 0;
                continue;
            }

            //判断是否为最后一个输出数据，是则调用break跳出循环体
            if(i==N-1){
                System.out.print(sushu[i]);
                break;
            }

            System.out.print(sushu[i]+" ");

            //每行每输入一个数据便使t+1
            t++;
        }
    }

    //获取素数的函数,参数N用来约束数组长度，减少运算量
    public static int[] getSushu(int N){

        //如果N<2,使之等于2，从而让后面的 sushu[0] = 2; sushu[1] = 3;不会报错
        if(N<2){
            N = 2;
        }

        //初始化一个素数数组，长度为N
        int[] sushu = new int[N];

        //初始化t作为数组下表
        int t = 2;

        sushu[0] = 2;
        sushu[1] = 3;

        //使用数组存储素数，从5开始，一直到存储了N个素数则停止； i+=2筛掉了偶数
        for(int i=5; t<sushu.length; i+=2){

            //这句if语句用于筛掉不可能为素数的数（1.余数为偶数则为2的倍数，2.余数为3则为3的倍数）
            if(i%6==1||i%6==5){

                //使用Math.sqrt(i)获得i的平方根并(int)将其强制转化为整形数据
                int a = (int)Math.sqrt(i);

                //从a开始一直往2遍历，如果没有一个能被i整除，则i为素数。
                for(int b = a; b>1; b--){
                    if(i%b==0){
                         break;
                    }
                    if(b == 2){
                        sushu[t++] = i;
                    }
                }
            }
        }
        //返回素数数组
        return sushu;
    }
}
