package cscmssitcoding;
import java.util.Scanner;
public class grading2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stu=sc.nextInt();
        int [] stuMark=new int[stu];
        int [] stuMark1=new int[stu];
        int [] percentile=new int[stu];
        int [] sorted=new int[stu];
        int temp=0;
        for(int i=0;i<stu;i++){
            stuMark1[i]=sc.nextInt();
        }
        for(int i=0;i<stu;i++){
            stuMark[i]=stuMark1[i];
        }
        for(int i=0;i<stu;i++){
            for(int j=i+1;j<stu;j++){
                if(stuMark[i]>stuMark[j]){
                temp =stuMark[i];
                stuMark[i]=stuMark[j];
                stuMark[j]=temp;
                }
            }   
        }
        
        for(int i=0;i<stu;i++){
            for(int j=0;j<stu;j++){
                if(stuMark1[i]==stuMark[j]){
                    sorted[i]=j;
                   
                }

            }
        }
        for(int i=0;i<stu;i++){
            
            percentile[i]=((sorted[i]+1)*100)/(stu+1);
            
            
        }
        for(int i:percentile){
            if(i>=90){
                System.out.print("A ");
            }
            else if(i>=70){
                System.out.print("B ");
            }
            else if(i>=50){
                System.out.print("C ");
            }
            else if(i>=30){
                System.out.print("D ");
            }
            else if(i>=10){
                System.out.print("E ");
            }
            else{
                System.out.print("F ");
            }
        }
        sc.close();
    }
}
