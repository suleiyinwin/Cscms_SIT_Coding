package cscmssitcoding;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        long fact=1;
        while(x<1 || x>20)
        {
           System.out.println("Enter the number again");
           x=sc.nextInt();
        }
        
        if(x>=1 && x<=20){
             for(int i=1;i<=x;i++){
               fact = fact*i;

            }System.out.println(fact);
        }
           
        
        
        
        sc.close();
    }
    
}
