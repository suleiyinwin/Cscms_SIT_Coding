package cscmssitcoding;

import java.util.Scanner;

public class No83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=0;i<col;i++){
            System.out.print("*_");
        }
        System.out.println("*");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("|_");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
