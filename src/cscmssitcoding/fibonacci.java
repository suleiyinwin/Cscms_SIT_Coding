package cscmssitcoding;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=0;
        int b=1;
        if(x==1){
            System.out.println(a);
        }
        else if(x==2){
            System.out.print(a+" "+b);
        }
        else{
             System.out.print(a+" "+b);
            int fi;
        for(int i=2;i<x;i++){
            fi= a+b;
            System.out.print(" "+fi);
            a=b;
            b=fi;
            
        }
        }
       
        
        sc.close();
    }
}
