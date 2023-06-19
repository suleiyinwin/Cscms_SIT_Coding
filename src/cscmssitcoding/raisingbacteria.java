package cscmssitcoding;

import java.util.Scanner;

public class raisingbacteria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1;
        int bat=sc.nextInt();
        
        while(bat!=1){
            if(bat%2==0){
                bat=bat/2;
            }
            else if(bat%2==1){
            count++;
            bat= bat/2;
            }

        }
        

        System.out.println(count);
        sc.close();
        
       
    }
}
