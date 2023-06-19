package cscmssitcoding;

import java.util.Scanner;

public class thepowerofpower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int query=sc.nextInt();
        long result=1;
        long side=1;
        long result1=0;
        int check=0;
        int [][]input=new int [query][3];
        for(int i=0;i<query;i++){
            int a=sc.nextInt();
            input[i][0]=a;
            int b=sc.nextInt();
            input[i][1]=b;
            int m=sc.nextInt();
            input[i][2]=m;
        }
        for(int i=0;i<query;i++){
            for(int j=0;j<input[i][1];j++){
                result = result*input[i][0];
                if(result==input[i][2]){
                    check=1;
                    break;
                }
                else if(result>input[i][2]){
                        side*=result%input[i][2];
                        result=1;
                    
                    if(side>input[i][2]){
                        side=side%input[i][2];
                    }
                }
            result1 = (side*result)%input[i][2];

            }
            if(check==1){
                System.out.println("0");
            }
            else{
                System.out.println(result1);
            }
            result1=0;
            result=1;
            side=1;
            check=0;
        }
        sc.close();
    }
}

