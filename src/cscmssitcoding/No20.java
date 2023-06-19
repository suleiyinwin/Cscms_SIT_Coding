package cscmssitcoding;

import java.util.Scanner;

public class No20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int largest=0;
        int [][] mountain=new int[size][2];
        for(int i=0;i<size;i++){
            mountain[i][0]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int count=1;
            mountain[i][1]=count;
            for(int j=0;j<mountain[i][0]-1;j++){
                count+=2;
                mountain[i][1]=count;
            }
            count=0;
        }
        for(int i=0;i<size;i++){
            if(mountain[i][0]>largest)
            largest=mountain[i][0];
        }
        for(int i=0;i<largest;i++){
            for(int j=0;j<size;j++){
                if(largest-i <=mountain[j][0]){
                    int count=0;
                    for(int k=0;k<largest-i-1;k++){
                        System.out.print("-");
                        count++;
                    }
                    for(int l=0;l<mountain[j][1]-(2*count) ;l++){
                        System.out.print("*");
                    }
                    for(int m=0;m<largest-i-1;m++){
                        System.out.print("-");
                    }
                    count=0;
                }
                else{
                    for(int n=0;n<mountain[j][1];n++){
                        System.out.print("-");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
