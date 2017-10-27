// https://www.hackerrank.com/challenges/java-static-initializer-block

import java.util.Scanner;

public class staticTest {
    static boolean flag = false;
    static int B;
    static int H;
    static{
        Scanner input = new Scanner(System.in);
        int breadth = input.nextInt();
        int height = input.nextInt();
        if(height <=0 || breadth <= 0){

            System.out.println("Shouldn't be negative");
        }else{
            B = breadth;
            H = height;
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area = B*H;
            System.out.print(area);
        }
    }
}
