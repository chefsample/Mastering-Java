import java.util.Scanner;
//https://www.hackerrank.com/challenges/30-sorting/problem
public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = input.nextInt();
        }
        input.close();
        int num = 0;
        for (int j = 0; j < N; j++) {

            for (int i = 0; i < N-1; i++) {
                if (a[i] > a[i + 1]) {
//                    swap(a[i], a[i + 1]);
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    num++;
                }

            }
            if (num == 0) {
                break;
            }
        }
        int firstElement = a[0];
        int lastElement = a[N-1];

        System.out.println("Array is sorted in "+num+"swaps.");
        System.out.println("First Element:"+firstElement);
        System.out.println("Last Element:"+lastElement);


    }

//    private static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b= temp;
//
//
//    }
}
