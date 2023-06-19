package dnd;

import java.util.Scanner;

public class DndSecondChance2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int swapSize=sc.nextInt();
        int swap[][]=new int[swapSize][2];
        for(int i=0;i<swapSize;i++){
            for (int j=0;j<2;j++){
                swap[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<swapSize;i++){
            int temp=0;
            temp=arr[swap[i][0]];
            arr[swap[i][0]]=arr[swap[i][1]];
            arr[swap[i][1]]=temp;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
