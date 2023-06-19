package cscmssitcoding;

import java.util.Scanner;

public class No82 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String toDecrypt=sc.nextLine();
        String [] dec=toDecrypt.split(" ");
        String[] enc={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
        "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<dec.length;i++){
            for(int j=0;j<26;j++){
                if(dec[i].equals(enc[j])){
                    System.out.print(Character.toChars(j+65));
                }
            }
        }
        sc.close();
    }
}
