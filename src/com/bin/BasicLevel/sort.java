package com.bin.BasicLevel;


import java.util.Arrays;

/**
 * Created by  bin
 * Time： 2017/12/8.
 */
public class sort {

    public static void main(String args[]){
        int a[] = {1,5,3,9,4,56,3,80,0,7};
        print(StraightInsertionSort(a));
        int b[] = {1,5,3,9,4,56,3,80,0,7};
        print(bubbling(b));
        int c[] = {1,5,3,9,4,56,3,80,0,7};
        print(choose(c));
        int d[] = {1,5,3,9,4,56,3,80,0,7};
        quickSort(d, 0, d.length-1);
        print(d);
        int e[] = {1,5,3,9,4,56,3,80,0,7};
        Arrays.sort(e);
        print(e);
    }

    //1.直接插入排序(Straight Insertion Sort)
    public static int[] StraightInsertionSort(int a[]){
        for(int i=1; i<a.length; i++){
            if(a[i]<a[i-1]){
                int x = a[i];
                int j = i-1;
                while(x < a[j]){
                    a[j+1] = a[j];
                    if(j==0){
                        j = -1;
                        break;
                    }
                    j--;
                }
                a[j+1] = x;
            }
        }
        return a;
    }

    //2.冒泡排序
    public static int[] bubbling(int a[]){
        int t;
        boolean flag;//通过flag优化冒泡排序，当数组已经按照顺序排列时，不再进行排列。
        for(int i=0; i<a.length-1; i++){
            flag = false;
            for(int j=a.length - 1; j>i; j--){
                if(a[j-1] > a[j]){
                    t = a[j];
                    a[j] = a[j-1];
                    a[j-1] = t;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        return a;
    }

    //3.选择排序
    public static int[] choose(int a[]){
        int minIndex;
        int t;
        for(int i=0; i<a.length; i++){
            minIndex = i;
            for(int j=i+1; j<a.length; j++){
                if(a[minIndex] > a[j]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                t = a[i];
                a[i] = a[minIndex];
                a[minIndex] = t;
            }
        }
        return a;
    }


    //快速排序
    public static void quickSort(int a[], int left, int right){
        if(left>=right){
            return;
        }

        int i = left, j = right, key = a[left];

       while(i<j){
           while(i<j&&a[j]>=key){
               j--;
           }

           while(i<j&&a[i]<=key){
               i++;
           }

           if(i<j){
               int t = a[j];
               a[j] = a[i];
               a[i] = t;
           }
       }

       a[left] = a[i];
       a[i] = key;

       quickSort(a, left, i-1);
       quickSort(a, i+1, right);
    }

    //输出数组
    public static void print(int arr[]){
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println("");
    }
}
