package com.bin.BasicLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by  bin
 * Time： 2017/12/13.
 */
public class test17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean t = true;
        List<Character> list= new ArrayList<Character>();
        for(int i=0; i<A.length(); i++,t=true){
            for(int j=0; j<B.length()&&t; j++){
                if(A.charAt(i) == B.charAt(j)){
                    t = false;
                }
            }
            if(t&&!list.contains(Character.toUpperCase(A.charAt(i)))){
                list.add(Character.toUpperCase(A.charAt(i)));
            }
        }
        for(int i=0; i<list.size(); i++){
            if(Character.isLowerCase(list.get(i))){
                System.out.print(Character.toUpperCase(list.get(i)));
            }else{
                System.out.print(list.get(i));
            }
        }
    }
}
