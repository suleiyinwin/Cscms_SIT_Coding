package cscmssitcoding;
import java.util.Scanner;
public class No54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int toSort[]=new int[size];
        int temp=0;
        for(int i=0;i<size;i++){
            toSort[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(toSort[i]<toSort[j]){
                    temp =toSort[i];
                    toSort[i]=toSort[j];
                    toSort[j]=temp;
                }
            }
        }
        for(int i=0;i<size/2;i++){
            System.out.print(toSort[i]+" "+toSort[size-1-i]+" ");
        }
        if(size%2==1){
            System.out.println(toSort[(size)/2]);
        }
        
        sc.close();
    }
}
