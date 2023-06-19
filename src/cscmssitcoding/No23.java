package cscmssitcoding;

import java.util.Scanner;

public class No23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=90){
            System.out.print("A");
        }
        else if(mark>=80){
            System.out.print("B");
        }
        else if(mark>=60){
            System.out.print("C");
        }
        else if(mark>=50){
            System.out.print("D");
        }
        else{
            System.out.print("F");
        }
        sc.close();
    }
}
