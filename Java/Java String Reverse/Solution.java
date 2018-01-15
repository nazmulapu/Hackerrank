//https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse = new StringBuffer(A).reverse().toString();
       
        /* Another solution using stack
         Stack<String> stack=new Stack<String>();
         stack.push(A);
         String A_rev = stack.pop(); */
        
         if (A.equals(reverse)){
             System.out.println("Yes");
         } else {
             System.out.println("No");
         }

        /* Enter your code here. Print output to STDOUT. */
        
        
        
    }
}
