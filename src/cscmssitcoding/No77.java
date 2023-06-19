package cscmssitcoding;

import java.util.Scanner;

public class No77 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int toPay=sc.nextInt();
        int inHand=sc.nextInt();
        int coinName[]={1000,500,100,50,20,10,5,2,1};
        int coin[]=new int[9];
        if(toPay>inHand){
            System.out.println("Not enough money.");
        }
        else if(toPay==inHand){
            System.out.println("No change for you.");
        }
        else{
            int change=inHand-toPay;
            System.out.println("Change: "+change);
            for(int i=0;i<9;i++){
                coin[i]=change/coinName[i];
                change=change%coinName[i];
            }
            for(int i=0;i<9;i++){
            System.out.println(coinName[i]+"THB: "+coin[i]);
        }
        }
        
    }
}
