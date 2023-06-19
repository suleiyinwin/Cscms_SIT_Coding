package cscmssitcoding;
import java.util.Scanner;
import java.util.Arrays;
public class No93 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        String rev[]=new String[num];
        for(int i=0;i<num;i++){
            rev[i]=sc.next();
        }
        for(int i=0;i<num;i++){
            for(int j=rev[i].length()-1;j>=0;j--){
                if(j==rev[i].length()-1){
                    System.out.print(rev[i].toUpperCase().charAt(j));
                }
                else{
                    System.out.print(rev[i].toLowerCase().charAt(j));
                }
            }
            System.out.print(" ");
        }
        }
}
