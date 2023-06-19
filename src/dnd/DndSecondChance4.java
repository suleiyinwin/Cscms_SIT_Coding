package dnd;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DndSecondChance4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String[] sentence=new String[size];
        for(int i=0;i<size;i++){
            sentence[i]=sc.next().toLowerCase();
        }
        Collections.reverse(Arrays.asList(sentence));
        for(int i=0;i<size;i++){
            int len=sentence[i].length();
            System.out.print(sentence[i].substring(len-1)+sentence[i].substring(1,len-1)+sentence[i].substring(0,1)+" ");
        }
    }
}
