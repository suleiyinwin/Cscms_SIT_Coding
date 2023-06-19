package cscmssitcoding;

import java.util.Scanner;

public class fruitpicker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int day=sc.nextInt();
        int total=0;
        int temp=0;
        int rol1=0;
        int col1=0;
        int field[][]=new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                field[i][j]=sc.nextInt();
            }
        }
        for(int k=0;k<day;k++){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(temp<field[i][j]){
                        temp=field[i][j];
                        rol1=i;
                        col1=j;
                    }
                }
            }
            field[rol1][col1]=-1;
            total+=temp;
            temp=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    field[i][j]--;
                }
            }
        }
        System.out.println(total);
        sc.close();
    }
}
