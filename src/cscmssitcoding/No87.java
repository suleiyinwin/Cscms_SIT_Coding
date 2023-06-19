package cscmssitcoding;

import java.util.Scanner;

public class No87 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String num=sc.next();
   Sum s=new Sum();
   System.out.println(s.summation(num));
    sc.close();
   }

}
class Sum{
   int sum=0;
   public int summation(String num){
         if(num.length()==1){
            sum+=Integer.parseInt(num.substring(0,1)) ;
            return sum;
         }
         else{
            sum+=Integer.parseInt(num.substring(0,1)) ;
            num=num.substring(1);
            return summation(num);
         }
   }
}