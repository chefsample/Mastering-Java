//https://www.hackerrank.com/challenges/30-abstract-classes/problem
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String title = scan.next();
        String author = scan.next();
        int price = scan.nextInt();
        scan.close();

        Book sample = new MyBook(title,author,price);
        sample.display();
    }
}
