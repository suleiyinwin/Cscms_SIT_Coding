package cscmssitcoding;

import java.util.Scanner;

public class peakfinding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        if(n==1){
            int peak1=sc.nextInt();
            System.out.println("1");
            System.out.println(peak1);
            
        }
        else{
            int findpeak[]=new int[n];
        boolean peak[]=new boolean[n];
        for(int i=0;i<n;i++){
            findpeak[i]=sc.nextInt();
        }
        if(findpeak[0]>=findpeak[1]){
            peak[0]=true;
            count++;
        }
        for(int i=1;i<n-1;i++){
            if(findpeak[i] >= findpeak[i-1] && findpeak[i]>=findpeak[i+1]){
                peak[i]=true;
                count++;
            }
            
        }
        if(findpeak[n-1]>=findpeak[n-2]){
            count++;
            peak[n-1]=true;
        }
        System.out.println(count);
            for(int i=0;i<n;i++){
            if(peak[i]){
                System.out.print(findpeak[i]+" ");
            }
        }
        }
        
        sc.close();
        
    }
}
