package cscmssitcoding;

import java.util.Scanner;

public class No32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            for(int k=0;k<i;k++){
                System.out.print("-");
            }
            for(int j=0;j<size-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
