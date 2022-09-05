import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum= A.length()+B.length();
        String Aa = A.substring(0, 1).toUpperCase() + A.substring(1); 
        String Bb = B.substring(0, 1).toUpperCase() + B.substring(1); 
        int A1= A.charAt(0);
        int B1= B.charAt(0);
        if(A1<=B1) {
            System.out.println(sum);
            System.out.println("No");
            System.out.println(Aa + " " +Bb);
        }
        else 
        {
            System.out.println(sum);
            System.out.println("Yes");
            System.out.println(Aa+" "+Bb);
        }
    }
}



