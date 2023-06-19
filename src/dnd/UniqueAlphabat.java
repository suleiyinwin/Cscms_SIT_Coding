package dnd;

import java.util.Scanner;

public class UniqueAlphabat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next().toUpperCase();
        int alphabat[]=new int[26];
        for(int i=0;i<str.length();i++){
            alphabat[str.charAt(i)-65]++;
        }
        for(int i=0;i<26;i++){
            if(alphabat[i]!=0){
                System.out.print(Character.toChars(i+65));
                System.out.print(" ");
            }
        }

    }
}
