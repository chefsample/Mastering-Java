package exceptions;

public class Calculator {
    public int power(int a, int b)throws Exception{
        while(a>0 && b>0){
            int ans = (int) Math.pow(a, b);
            return ans;
        }

        throw new Exception("Numbers can't be Negative");
    }
}
