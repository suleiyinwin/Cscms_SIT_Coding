package cscmssitcoding;

import java.util.Scanner;

public class No111 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        String check=sc.next().toLowerCase();
        boolean f=true;
        boolean b=true;
        if(s.contains(check)){
            for(int i=0;i<check.length();i++){
                if(s.charAt(i)!=check.charAt(i)){
                    f=false;
                    break;
                }
            }
            for(int i=0;i<check.length();i++){
                if(s.charAt(s.length()-1-i)!=check.charAt(check.length()-1-i)){
                    b=false;
                    break;
                }
            }
            
        }
        else{
            f=false;
            b=false;
        }
        if(f){
            System.out.print("Front");
        }
        if(f && b){
            System.out.print(",");
        }
        if(b){
            System.out.print("Back");
        }
        if(!f && !b){
            System.out.println("No");
        }
    }
}
