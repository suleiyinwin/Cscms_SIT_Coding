package cscmssitcoding;

import java.util.Arrays;
import java.util.Scanner;

public class No94 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        double []arr=new double[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextDouble();
        }
        double temp=0;
        Arrays.sort(arr);
        for(int i=0;i<size/2;i+=2){
            temp=arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
        for(int i=0;i<size;i++){
            System.out.printf("%.2f",arr[i]);
            System.out.print(" ");
        }
    }
}
