package cscmssitcoding;

import java.util.Scanner;

public class raining1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bucket=sc.nextInt();
        int day=sc.nextInt();
        int [] bucketUnit=new int[bucket];
        int rain[][]=new int[day][2];
        for(int i=0;i<day;i++){
            rain[i][0]=sc.nextInt();
            rain[i][1]=sc.nextInt();
        }
        for(int i=0;i<day;i++){
            for(int j=rain[i][0];j<=rain[i][1];j++){
                bucketUnit[j-1]+=1;
            }
        }
        for(int i=0;i<bucket;i++){
            System.out.print(bucketUnit[i]+" ");
        }
        sc.close();
    }
}
