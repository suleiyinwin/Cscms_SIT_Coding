package cscmssitcoding;

import java.util.Scanner;

public class No86 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        ToMultiply m=new ToMultiply();
        System.out.println(m.multiply(a, b));
    }
}
class ToMultiply{
    int res=0;
    public int multiply(int a, int b){
        if(b==0){
            return res;
        }
        else{
            res+=a;
            b-=1;
            return multiply(a, b);
        }
    }
}