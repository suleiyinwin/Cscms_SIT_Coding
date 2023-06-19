package cscmssitcoding;

import java.util.Scanner;

public class No76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String dec=sentence.toLowerCase();
        char[] toEnc={'a','b','c','d','e','f','g','h','i','j','k','l','m',
        'n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        String[] enc={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
        "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
        for(int i=0;i<dec.length();i++){
            for(int j=0;j<27;j++){
                if(dec.charAt(i)==toEnc[j]){
                    System.out.print(enc[j]+" ");
                    break;
                }
            }
        }

        sc.close();
    }
}
