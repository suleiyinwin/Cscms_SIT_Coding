package cscmssitcoding;

import java.util.Scanner;

public class No84 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        
        // int size=sc.nextInt();
        // String [][]sweety=new String[size][2];
        // for(int i=0;i<size;i++){
        //     for(int j=0;j<2;j++){
        //         sweety[i][j]=sc.next();
        //     }
        // }
        // for(int i=0;i<size;i++){
            
        //     int count=0;
        //     if(sweety[i][0].length()==sweety[i][1].length()){
        //         String[]str1=new String[sweety[i][0].length()];
        //         String[]str2=new String[sweety[i][0].length()];
        //         for(int k=0;k<sweety[i][0].length();k++){
        //             str1[k]=Character.toString(sweety[i][0].charAt(k));
        //             str2[k]=Character.toString(sweety[i][1].charAt(k));
        //         }
        //         for(int j=0;j<str1.length;j++){
        //             for(int z=0;z<str2.length;z++){
        //                 if(str1[j].equals(str2[z])){
        //                     str1[j]="0";
        //                     str2[z]="0";
        //                     count++;
        //                     break;
        //                 }
        //             }
        //         }
        //         if(count==sweety[i][0].length()){
        //             System.out.println("Yes");
        //         }
        //         else{
        //             System.out.println("No");
        //         }
        //         count=0;
        //     } 
        //     else{
        //         System.out.println("No");
        //     }
            
        // }
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
    	String str1 = sc.next();
      	String str2 = sc.next();
      int n1 = str1.length();
      int n2 = str2.length();
      int count = 0;
      	if(n1 == n2){
        	for(int j=0; j<n1; j++){	
            	if(str2.contains(str1.substring(j,j+1))){
                	count+= 1;
                }
            }
            if(count == n1){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
        }else{
        	System.out.println("No");
        }
    }
  
    }
}
