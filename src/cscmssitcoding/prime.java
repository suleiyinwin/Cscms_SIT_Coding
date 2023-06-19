package cscmssitcoding;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int check=0;
      
    	if(x==1 || x==0){
          System.out.println("No");
        }
        else{
            for(int i=2;i<=(x/2);i++){
            if(x%i==0){
                System.out.println("No");
              	check=1;
              	break;
            }
            
        }
         if(check==0)
    {
     System.out.println("Yes"); 
    }
        }
        sc.close();
        
    }
}
