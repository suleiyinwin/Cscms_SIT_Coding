package cscmssitcoding;
import java.util.*;
public class No91 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double input=sc.nextDouble();
        if(Math.round(input)%10==7){
            System.out.println("Unlucky");
        }
        else if(Math.round(input)%7==0){
            System.out.println("Unlucky");
        }
        else{
            System.out.println("Lucky");
        }
    }
}
