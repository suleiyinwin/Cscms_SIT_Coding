package cscmssitcoding;

import java.util.Scanner;

public class No25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int second=sc.nextInt();
        if(first>second){
            for(int i=0;i<=first-second;i++){
                for(int j=first;j>=first-i;j--){
                    System.out.print(j+" ");
                }
            }
        }
        else{
            for(int i=0;i<=second-first;i++){
                for(int j=second;j>=second-i;j--){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
