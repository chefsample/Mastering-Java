//      https://www.hackerrank.com/challenges/java-loops
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = 0;

            for(int j=0;j<n;j++){
                int result = result = (int) Math.pow(2,j);
                sum = sum + (result*b);
                System.out.print((a+sum)+" ");
            }
            System.out.println("");


        }
        in.close();
    }
}
