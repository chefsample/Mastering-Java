import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int idNum = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i =0; i< numScores;i++){
            testScores[i] = scan.nextInt();
        }

        scan.close();

        Student s = new Student(firstName,lastName,idNum,testScores);
        s.printPerson();
        System.out.println("Grade:"+s.calculate());


    }
}
