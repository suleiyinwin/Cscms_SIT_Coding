package cscmssitcoding;

import java.util.Scanner;

public class No154 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int tosum=sc.nextInt();
        int temp=0;
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<=size-tosum;i++){
            int sum=array[i]+array[i+1]+array[i+2];
            if(sum>temp){
                temp=sum;
            }
        }
        System.out.println(temp);
        sc.close();
    }
}
