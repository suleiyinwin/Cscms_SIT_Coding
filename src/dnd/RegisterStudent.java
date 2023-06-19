package dnd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RegisterStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> sub=new ArrayList<String>();
        ArrayList<Integer> sortlist=new ArrayList<Integer>();
        while(!"end".equals(s)){
            sub.add(s);
            list.add(Integer.parseInt(s.substring(s.indexOf(",")+1)));
            sortlist.add(Integer.parseInt(s.substring(s.indexOf(",")+1)));
            s=sc.next();
        }
        Collections.sort(sortlist);
        for(int i=0;i<list.size();i++){
            if(sortlist.get(sortlist.size()-1)==list.get(i)){
                System.out.println(sub.get(i));
            }
        }
    }
}
