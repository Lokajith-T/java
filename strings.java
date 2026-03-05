import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        int a1=A.length();
        int b1=B.length();
        int cmp=A.compareTo(B);
        System.out.println(a1+b1);
        if(cmp>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String aa=A.substring(0,1).toUpperCase()+A.substring(1);
        String bb=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(aa+" "+bb);
    }
}



