package cscmssitcoding;

import java.util.Scanner;

public class No95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        double av=0;
        double matrix[][]=new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Average of each row:");
        for(int i=0;i<row;i++){
            av=0;
            for(int j=0;j<col;j++){
                av+=matrix[i][j];
            }
            System.out.printf("%.2f",av/col);
            System.out.print(" ");
            
        }
        System.out.println();
        System.out.println("Average of each column:");
        for(int i=0;i<col;i++){
            av=0;
            for(int j=0;j<row;j++){
                av+=matrix[j][i];
            }
            System.out.printf("%.2f",av/row);
            System.out.print(" ");
            
        }
    }
}
