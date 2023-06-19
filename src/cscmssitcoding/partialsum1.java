package cscmssitcoding;

import java.util.Scanner;

public class partialsum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int line=sc.nextInt();
        int[] tocal= new int [line];
        for(int i=0;i<line;i++){
            tocal[i]=sc.nextInt();
        }
        int query=sc.nextInt();
        int[][]cal=new int[query][2];
        for(int i=0;i<query;i++){
            cal[i][0]=sc.nextInt();
            cal[i][1]=sc.nextInt();
        }
        for(int i=0;i<query;i++){
            int result=0;
            for(int j=cal[i][0];j<=cal[i][1];j++){
                result+=tocal[j];
            }
            System.out.println(result);
        }
        sc.close();
    }
}
