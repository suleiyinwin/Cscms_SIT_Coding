package cscmssitcoding;

import java.util.Scanner;

public class No123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sen=sc.next();
        String check=sc.next();
        if(sen.equals(check)){
            System.out.println("Perfect Match");
        }
        else if(sen.toLowerCase().equals(check.toLowerCase())){
            System.out.println("Partial Match");
        }
        else if(sen.toLowerCase().contains(check.toLowerCase())){
            System.out.println("Partial Match");
        }
        else{
            System.out.println("Not Match");
        }
    }
}
