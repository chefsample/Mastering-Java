package maxdiff;
//https://www.hackerrank.com/challenges/30-scope/problem

public class Difference {

    private int[] elements;
    public int maxDiff;

    Difference(int[] a){
        this.elements = a;
    }


    public void computeDifference() {
        int tempDiff = 0;
        for(int i =1 ; i< elements.length;i++){
            for(int j = 1;j<elements.length;j++) {
                tempDiff = Math.abs(elements[j] - elements[i - 1]);

                if (maxDiff < tempDiff) {
                    maxDiff = tempDiff;
                }
            }
        }


    }
}
