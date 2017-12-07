package com.bin.BasicLevel;


import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/6.
 */
public class test8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int Awin = 0, draw = 0, Alose = 0;

        int winByB = 0, winByC = 0, winByJ = 0;

        int loseByB = 0, loseByC = 0, loseByJ = 0;

        char AwinType = 'B', BwinType = 'B';

        sc.nextLine();  //需要加这一行代码跳过获取N的那一个line

        for(int i=0; i<N; i++){
            String line =sc.nextLine();
            String lines[] = line.split(" ");
            String a  = lines[0];
            String b  = lines[1];
            if(a.charAt(0) == 'C'){
                if(b.charAt(0) == 'J'){
                    Awin++;
                    winByC++;
                }else if(b.charAt(0) == 'C'){
                    draw++;
                }else if(b.charAt(0) == 'B'){
                    Alose++;
                    loseByC++;
                }
            }else if(a.charAt(0) == 'B'){
                if(b.charAt(0) == 'J'){
                    Alose++;
                    loseByB++;
                }else if(b.charAt(0) == 'C'){
                    Awin++;
                    winByB++;
                }else if(b.charAt(0) == 'B'){
                    draw++;
                }
            }else if(a.charAt(0) == 'J'){
                if(b.charAt(0) == 'J'){
                    draw++;
                }else if(b.charAt(0) == 'C'){
                    Alose++;
                    loseByJ++;
                }else if(b.charAt(0) == 'B'){
                    Awin++;
                    winByJ++;
                }
            }
        }
        System.out.println(Awin+" "+draw+" "+Alose);
        System.out.println(Alose+" "+draw+" "+Awin);

        AwinType = winMore(winByB, winByC, winByJ);
        BwinType = winMore(loseByC, loseByJ, loseByB);
        System.out.println(AwinType+" "+BwinType);
    }

    public static char winMore(int winByB, int winByC, int winByJ){
        char win = 'B';
        if(winByB>winByC){
            if(winByB<winByJ){
                win = 'J';
            }
        }else if(winByB<winByC){
            if(winByC<winByJ){
                win = 'J';
            }else if(winByC>winByJ){
                win = 'C';
            }else{
                win = 'C';
            }
        }else if(winByB==winByC){
            if(winByB<winByJ){
                win = 'J';
            }
        }
        return win;
    }
}
