package cscmssitcoding;
import java.util.Scanner;
public class patternrectangle1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
          System.out.print("*");
        }
        System.out.println();
      }
      sc.close();
    }
}
