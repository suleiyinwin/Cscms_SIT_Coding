package cscmssitcoding;

import java.util.Scanner;

public class No24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        String represent=sc.nextLine().toLowerCase();
        String toSearch=sc.next().toLowerCase();
        int count=0;
        int counter[]=new int[represent.length()];
        String result="";
        for(int i=0;i<represent.length();i++){
            if(represent.charAt(i)==toSearch.charAt(0)){
                count++;
                counter[i]=1;
            }
        }
        if(count==0){
            System.out.print("ERROR");
        }
        else{
            System.out.println(count);
            for(int i=0;i<represent.length()-1;i++){
                if(counter[i]==1){
                    result+=i+", ";
                }
            }
            System.out.println(result.substring(0,result.length()-2));
        }

    }
}
