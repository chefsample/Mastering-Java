//https://www.hackerrank.com/challenges/30-scope/problem
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference diff = new Difference(a);

        diff.computeDifference();
        System.out.println(diff.maxDiff);
    }
}
