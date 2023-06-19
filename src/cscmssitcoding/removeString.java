package cscmssitcoding;
import java.util.Scanner;
public class removeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int a=str1.length();
        int b=str2.length();
        if(a>b){
          str1=str1.replace(str2,"");
              System.out.println(str1);
        }
        else{
          str2=str2.replace(str1,"");
          System.out.println(str2);
        }
        sc.close();
    }
}
