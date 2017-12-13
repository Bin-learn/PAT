package com.bin.BasicLevel;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/13.
 */
public class test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int effectiveCount = N;
        List<Person> list = new ArrayList<Person>();
        for(int i=0; i<N; i++){
            String name = sc.next();
            String a[] = sc.next().split("/");
            int y = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            int d = Integer.parseInt(a[2]);
            if(y<1814||(y==1814&&m<9)||(y==1814&&m==9&&d<6)||y>2014||(y==2014&&m>9)||(y==2014&&m==9&&d>6)){
                effectiveCount--;
                continue;
            }
            Person person = new Person(name, y, m, d);
            list.add(person);
        }
        //list.sort(Person::compareTo);
        Collections.sort(list);
        String old = list.get(0).name;
        String young = list.get(effectiveCount-1).name;
        System.out.println(effectiveCount+" "+old+" "+young);
    }

    static class Person implements Comparable<Person>{
        String name;
        int year, month, day;
        public Person(String name, int year, int month, int  day){
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }
        @Override
        public int compareTo(Person o) {
            if(this.year!=o.year){
                return this.year-o.year;
            }else if(this.month!=o.month){
                return this.month-o.month;
            }else if(this.day!=o.day)
                return this.day-o.day;
            return this.name.charAt(0)-o.name.charAt(0);
        }
    }
}
