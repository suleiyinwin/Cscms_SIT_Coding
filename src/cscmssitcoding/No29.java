package cscmssitcoding;

import java.util.Scanner;

public class No29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int size=sc.nextInt();
        for(int i=0;i<input.length();i++){
            if(i%size==0){
                System.out.print(input.charAt(i));
            }
        }
    }
}
