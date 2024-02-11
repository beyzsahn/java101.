package com.example.Java101;

public class DizidekilerinOrtalamasi {
    public static void main(String[] args){
        double[] list={1,2,3,4,5};
        //double sum=0;
        /*for(int i=0;i< list.length;i++){
            sum+=list[i];
        }*/
    //double avarage=sum/list.length;
       // System.out.println(avarage);

        System.out.println(harmonicMean(list));
    }
    public static double harmonicMean(double arr[]){
        double sum=0;
        for(int i=0;i< arr.length;i++){
            sum+=1.0/arr[i];
        }
        return arr.length/sum;
    }

}
