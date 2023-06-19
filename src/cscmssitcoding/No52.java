package cscmssitcoding;

import java.util.Scanner;

public class No52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String toRev=sc.next();
        for(int i=(toRev.length()/2)-1;i>=0;i--){
            System.out.print(toRev.charAt(i));
        }
        if(toRev.length()%2==1){
            System.out.print(toRev.charAt(toRev.length()/2));
            for(int i=toRev.length()-1;i>toRev.length()/2;i--){
                System.out.print(toRev.charAt(i));
            }
        }
        else{
            for(int i=toRev.length()-1;i>=toRev.length()/2;i--){
                System.out.print(toRev.charAt(i));
            }
        }
        
    }
}
