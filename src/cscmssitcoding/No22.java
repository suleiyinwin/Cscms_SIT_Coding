package cscmssitcoding;

import java.util.Scanner;

public class No22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String toSum=str.toUpperCase();
        int sum=0;
        for(int i=0;i<toSum.length();i++){
            if(toSum.charAt(i)>=65 && toSum.charAt(i)<=90){
                sum+=toSum.charAt(i)-64-i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
