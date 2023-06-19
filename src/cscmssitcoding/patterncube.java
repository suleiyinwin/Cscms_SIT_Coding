package cscmssitcoding;

import java.util.Scanner;

public class patterncube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0;
        for(int i=1;i<=x-1;i++){
            System.out.print("-");
        }
        for(int i=1;i<=x;i++){
            System.out.print("*");
        }
        System.out.println();
        int a=x;
        for(int i=1;i<=x-2;i++){
           for(int j=1;j<=a-2;j++){
            System.out.print("-");
            count++;
           }
           System.out.print("*");
           count++;
           for(int k=1;k<=x-2;k++){
            System.out.print("-");
            count++;
           }
          
            int point=2*x-1-count;
            System.out.print("*");
            for(int l=1;l<=point-2;l++){
                System.out.print("-");
            }
            System.out.print("*");
            a--;
           System.out.println();
           count=0;

        }
        for(int i=1;i<=x;i++){
            System.out.print("*");
        }
        for(int i=1;i<=x-2;i++){
            System.out.print("-");
        }
        System.out.println("*");
        int b=x;
        for(int i=1;i<=x-2;i++){
            
            System.out.print("*");
            for(int j=1;j<=x-2;j++){
                System.out.print("-");
            }
            System.out.print("*");
            for(int k=1;k<=b-3;k++){
                System.out.print("-");
            }
            System.out.print("*");
            System.out.println();
            b--;
        }
        for(int z=1;z<=x;z++){
            System.out.print("*");
        }
        sc.close();
    }
}
