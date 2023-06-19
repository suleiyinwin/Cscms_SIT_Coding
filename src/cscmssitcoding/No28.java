package cscmssitcoding;

import java.util.Scanner;

public class No28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char sign=sc.next().charAt(0);
        int b=sc.nextInt();
        switch(sign){
            case '+':System.out.println(a+b);break;
            case '-':System.out.println(a-b);break;
            case '*':System.out.println(a*b);break;
            case '/':{
                if(b==0){
                    System.out.println("error");break;
                }
                else{
                    System.out.println(a/b);break;
                }
            } 
            case '%':{
                if(b==0){
                    System.out.println("error");break;
                }
                else{
                    System.out.println(a%b);break;
                }
            } 
        }
        sc.close();
    }
}
