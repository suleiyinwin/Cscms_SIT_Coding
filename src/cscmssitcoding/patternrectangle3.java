package cscmssitcoding;
import java.util.Scanner;
public class patternrectangle3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print("-");
        for(int i=0;i<x-2;i++){
            System.out.print("*");
        }
        System.out.println("-");
        for(int i=0;i<x-2;i++){
           for(int j=0;j<x;j++){
            System.out.print("*");
           }
           System.out.println();
        }
        System.out.print("-");
        for(int i=0;i<x-2;i++){
            System.out.print("*");
        }
        System.out.println("-");
        sc.close();
    }
}
