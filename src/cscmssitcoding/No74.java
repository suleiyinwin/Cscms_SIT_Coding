package cscmssitcoding;

import java.util.Scanner;

public class No74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        String lastName=sc.next();
        System.out.println(firstName.substring(0,1).toUpperCase()+
        firstName.substring(1).toLowerCase()+" "+lastName.substring(0,1).toUpperCase()+
        lastName.substring(1).toLowerCase());
        sc.close();
    }
}
