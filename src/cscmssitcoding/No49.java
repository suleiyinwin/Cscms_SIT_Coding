package cscmssitcoding;

import java.util.Scanner;

public class No49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence1=sc.nextLine();
        String sentence=sentence1.toUpperCase();
        int[]alphabat=new int[28];
        int check=1;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                alphabat[26]++;
            }
            else if(sentence.charAt(i)=='_'){
                alphabat[27]++;
            }
            else{
                alphabat[sentence.charAt(i)-65]++;
            }
        }
        for(int i=0;i<26;i++){
            if(alphabat[i]>1){
                System.out.println(sentence1+" is not an isogram");
                check=0;
                break;
            }
        }
        if(check==1){
            System.out.println(sentence1+" is an isogram");
        }
    }
}
