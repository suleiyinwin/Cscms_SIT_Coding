package cscmssitcoding;

import java.util.Scanner;

public class Helloworld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Hello, "+str+".");
        sc.close();
    }
}
