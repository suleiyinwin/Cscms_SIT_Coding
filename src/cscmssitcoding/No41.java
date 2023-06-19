package cscmssitcoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> res=new ArrayList<Integer>();
        while(n>1){
             for(int i=2;i<=n;i++){
                if(n%i==0){
                res.add(i);
                n=n/i;
                break;
                }
            }
        }
        for(int i=0;i<res.size()-1;i++){
            System.out.print(res.get(i)+" x ");
        }
        System.out.println(res.get(res.size()-1));
        
    }
}
