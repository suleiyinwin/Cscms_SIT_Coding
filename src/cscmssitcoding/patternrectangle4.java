package cscmssitcoding;

import java.util.Scanner;

public class patternrectangle4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=0;i<y;i++){
            System.out.print("*"); 
        }
        System.out.println();
        for(int i=0;i<x-2;i++){
            System.out.print("*");
            for(int j=0;j<y-2;j++){
                System.out.print("-");
            }
            System.out.println("*");
        }
        for(int i=0;i<y;i++){
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
