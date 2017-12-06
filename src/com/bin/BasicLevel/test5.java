package com.bin.BasicLevel;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by  bin
 * Time： 2017/12/5.
 */
public class test5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int H = sc.nextInt();
        TreeSet<Stu> both = new TreeSet<Stu>();
        TreeSet<Stu> dc1 = new TreeSet<Stu>();
        TreeSet<Stu> dc2 = new TreeSet<Stu>();
        TreeSet<Stu> dc3 = new TreeSet<Stu>();
        for(int i=0; i<N; i++){
            Stu stu = new Stu(sc.nextInt(), sc.nextInt(), sc.nextInt());
            if(stu.d<L || stu.c<L){
                continue;
            }else if(stu.d>=H && stu.c>=H){
                both.add(stu);
            }else if(stu.d>=H){
                dc1.add(stu);
            }else if(stu.d>=stu.c){
                dc2.add(stu);
            }else{
                dc3.add(stu);
            }
        }
        System.out.println(both.size()+dc1.size()+dc2.size()+dc3.size());
        print(both);
        print(dc1);
        print(dc2);
        print(dc3);
    }
    static class Stu implements Comparable<Stu>{
        int id, d, c, sum;
        public Stu(int id, int d, int c){
            this.id = id;
            this.d = d;
            this.c = c;
            this.sum = d + c;
        }

        @Override
        public int compareTo(Stu o){
            if(this.sum != o.sum){
                return o.sum - this.sum;
            }
            if(this.d != o.d){
                return o.d - this.d;
            }
            return this.id-o.id;

        }
    }

    private static void print(TreeSet<Stu> stu){
        for (Stu s:stu){
            System.out.println(s.id+" "+s.d+" "+s.c);
        }
    }
}

