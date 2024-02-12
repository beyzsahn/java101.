package com.example.Java101;
import java.util.Arrays;
public class dizideTekrarEdenSayi {
    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] list={3,4,6,7,13,24,4,22,6,24,3,7};
        int[] duplicate=new int[list.length];
        int startIndex=0;
        for(int i=0;i<list.length;i++){
            for(int j=0;j< list.length;j++){
                if((i!=j)&& list[i]%2==0 &&list[i]==list[j]){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex++]=list[i];
                    }
                    break;
                }
            }
        }

        for(int value: duplicate){
            if(value!=0){
                System.out.println(value);
            }
        }
    }
}
