package cscmssitcoding;

import java.util.Arrays;
import java.util.Scanner;

public class No79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int sum=0;
        int[] input=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        Arrays.sort(input);
        System.out.print("Summation: ");
        for(int i=0;i<size;i++){
            sum+=input[i];
        }
        System.out.printf("%.2f%n",(double)sum);
        System.out.print("Average: ");
        System.out.printf("%.2f%n",((double)sum)/size);
        System.out.print("Max: ");
        System.out.printf("%.2f%n",(double)input[size-1]);
        System.out.print("Min: ");
        System.out.printf("%.2f%n",(double)input[0]);
    }
}
