package cscmssitcoding;

import java.util.Scanner;

public class No75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fp=sc.nextLine();
        String sp=sc.nextLine();
        String first="Mr.Ukrit Ruckcharti";
        String second="Dr.Worarat Krathu";
        if(fp.equalsIgnoreCase(sp)){
            System.out.println("Draw");
        }
        if(fp.equalsIgnoreCase("rock")){
            if(sp.equalsIgnoreCase("scissors")){
                System.out.println(first);
            }
            else if(sp.equalsIgnoreCase("paper")){
                System.out.println(second);
            }
        }
        if(fp.equalsIgnoreCase("scissors")){
            if(sp.equalsIgnoreCase("paper")){
                System.out.println(first);
            }
            else if(sp.equalsIgnoreCase("rock")){
                System.out.println(second);
            }
        }
        if(fp.equalsIgnoreCase("paper")){
            if(sp.equalsIgnoreCase("rock")){
                System.out.println(first);
            }
            else if(sp.equalsIgnoreCase("scissors")){
                System.out.println(second);
            }
        }

    }
}
