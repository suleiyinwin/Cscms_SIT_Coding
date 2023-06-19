package cscmssitcoding;

import java.util.Scanner;

public class No89 {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ChooseCapital c=new ChooseCapital();
        System.out.println(c.capital(str));

    }
   
    
}
class ChooseCapital{ 
    String s="";
     public String capital(String str){
        if(str.length()==0){
            return s;
        }
        else{
            if(str.charAt(0)>64 && str.charAt(0)<91){
                s+=str.charAt(0);
            }
            str=str.substring(1);
            return capital(str);
        }
        
    }
}