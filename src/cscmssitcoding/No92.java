package cscmssitcoding;

import java.util.Arrays;
import java.util.Scanner;
public class No92 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        double[] toSort=new double[size];
        for(int i=0;i<size;i++){
            toSort[i]=sc.nextDouble();
        }
        Arrays.sort(toSort);
        System.out.printf("%.2f",toSort[1]);
        System.out.print(" ");
        System.out.printf("%.2f",toSort[size-2]);
    }
}