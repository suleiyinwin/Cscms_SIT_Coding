 package dnd;

// import java.util.Scanner;

// public class DndSecondChance1 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int row=sc.nextInt();
//         int col=sc.nextInt();
//         int[][] matrix=new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 matrix[i][j]=0;
//             }
//         }
//         int place=sc.nextInt();
//         int click[][]=new int[place][2];
//         for(int i=0;i<place;i++){
//             for(int j=0;j<2;j++){
//                 click[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<place;i++){
//             matrix[click[i][0]][click[i][1]]++;
//             //top
//             if(click[i][0]!=0 ){
//                 matrix[click[i][0]-1][click[i][1]]++;
//             }
//             //bottom
//             if(click[i][0]!=row-1){
//                 if(matrix[click[i][0]+1][click[i][1]]<3){
//                     matrix[click[i][0]+1][click[i][1]]++;
//                 }
//                 else{
//                     matrix[click[i][0]+1][click[i][1]]=1;
//                 }
//             }
//             //left
//             if(click[i][1]!=0){
//                 if(matrix[click[i][0]][click[i][1]-1]<3){
//                     matrix[click[i][0]][click[i][1]-1]++;
//                 }
//                 else{
//                     matrix[click[i][0]][click[i][1]-1]=1;
//                 }
                
//             }
//             //right
//             if(click[i][1]!=col-1){
//                 if(matrix[click[i][0]][click[i][1]+1]<3){
//                     matrix[click[i][0]][click[i][1]+1]++;
//                 }
//                 else{
//                     matrix[click[i][0]][click[i][1]+1]=1;
//                 }
//             }
//         }
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                  System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
import java.util.Scanner;
public class DndSecondChance1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc. nextInt();
        int[][] matrix= new int[row1][col1];
        int row2 =sc.nextInt();
        for(int i=0; i<row1 ; i++){
            for(int j=0 ; j<col1 ; j++){
                matrix[i][j]=0;
            }
        }
        for(int i=0 ; i<row2 ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            //top
            if(x!=0){
                matrix[x-1][y]+=1;
            }
            //bottom
            if(x!=row1-1){
                matrix[x+1][y]+=1;
            }
            //left
            if(y!=0){
                matrix[x][y-1]+=1;
            }
            //right
            if(y!=col1-1){
                matrix[x][y+1]+=1;
            }
            matrix[x][y]+=1;
            
            
            
            
        }
        for(int i=0; i<row1 ; i++){
            for(int j=0 ; j<col1 ; j++){
                if(matrix[i][j]>3){
                    matrix[i][j]=1;
                }
            }
        }
        for(int[] a: matrix){
            for(int b:a){
                System.out.print(b +" ");
            }
            System.out.print("\n");
        }
        
    }
}