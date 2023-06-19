package cscmssitcoding;

import java.util.Scanner;

public class No67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int block=sc.nextInt();
        int coin=0;
        for(int i=1;i<=block;i++){
            if(i%15==0){
                coin+=i*10;
            }
            else if(i%5==0){
                coin+=i*3;
            }
            else if(i%3==0){
                coin+=i*2;
            }
            else{
                coin+=i;
            }
        }
        System.out.println(coin);
    }
}
