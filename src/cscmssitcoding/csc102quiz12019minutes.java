package cscmssitcoding;

import java.util.Scanner;

public class csc102quiz12019minutes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int minutes=sc.nextInt();
        int year=minutes/(365*24*60);
        int days=(minutes/60/24)%365;
        System.out.print(year+" ");
        System.out.println(days);
        sc.close();
    }
}
