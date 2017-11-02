import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();

        char[] s = input.toCharArray();

        Solution p = new Solution();

        for(char c : s){
            p.enqueu(c);
            p.push(c);
        }

        boolean isPalindrome = true;
        for(int i=0; i<s.length/2;i++){
            if(p.popCharacter()!=p.dequeueCharacter()){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ));
    }

    Stack<Character> popStack = new Stack<>();
    Queue<Character> popQueue = new LinkedList<>();

    private void enqueu(char c){
        popQueue.add(c);
    }

    private char dequeueCharacter(){
        return popQueue.remove();
    }
    private char popCharacter() {
        return popStack.pop();
    }

    private void push(char c) {
        popStack.push(c);

    }


}
