package cscmssitcoding;

import java.util.Arrays;
import java.util.Scanner;

public class No43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String coin=sc.nextLine();
        String []arr=coin.split(" ");
        int []coinList=new int[arr.length];
        int []coinList1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            coinList[i]=Integer.parseInt(arr[i]);
        }
        for(int i=0;i<coinList.length;i++){
            for(int j=0;j<coinList.length;j++){
                if(coinList[i]>coinList[j]){
                    coinList1[i]+=coinList[i]-coinList[j];
                }
                else{
                    coinList1[i]+=coinList[j]-coinList[i];
                }
            }
        }
        Arrays.sort(coinList1);
        System.out.println(coinList1[0]);
    }
}
