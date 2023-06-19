package dnd;

import java.util.Scanner;

public class Dnd1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int res=0;
        for(int i=input-5;i<=input+5;i++){
            if(i%3==0){
                res-=i;
            }
            else{
                res+=i;
            }
        }
        System.out.println(res);
    }
}
