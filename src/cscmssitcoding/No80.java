package cscmssitcoding;

import java.util.Scanner;

public class No80 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        Octal o=new Octal();
        for(int i=o.toOctal(dec).length()-1;i>=0;i--){
            System.out.print(o.toOctal(dec).charAt(i));
        }
      sc.close();
    }
}
class Octal{
    String s="";
    public String toOctal(int dec){
        
        if(dec<=7){
            s+=dec%8;
            return s;
        }
        else{
            s+=dec%8;
            return toOctal(dec/8);
        }
    }
}