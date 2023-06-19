package dnd;

import java.util.Arrays;
import java.util.Scanner;

public class Dnd2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String []sen=new String[size];
        for(int i=0;i<size;i++){
            sen[i]=sc.next().toUpperCase();
        }
        for(int i=0;i<size;i++){
            char[]sen1=sen[i].toCharArray();
            Arrays.sort(sen1);
            for(int j=0;j<sen1.length;j++){
                System.out.print(sen1[j]);
            }
            System.out.print(" ");
        }
    }
}
