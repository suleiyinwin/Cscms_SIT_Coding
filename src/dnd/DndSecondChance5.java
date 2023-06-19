package dnd;

import java.util.Scanner;

public class DndSecondChance5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int res=0;
        for(int j=i;j<=i+20;j+=2){
            res+=j;
        }
        System.out.println(res);
    }
}
