
public class SimpleDotComTest {

    public static void main(String[] args) {

        SimpleDotCom dot = new SimpleDotCom();

        int numOfGuesses = 0;

        int randomNum = (int)(Math.random()*5);

        int[] locations ={randomNum,randomNum+1,randomNum+2};

        dot.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive == true){
          GameHelper input = new GameHelper();
          String userGuess = input.getUserInput("Enter a number");
          String result = dot.checkYourself(userGuess);
          numOfGuesses++;
          if(result.equals("Kill")){
            isAlive = false;
          }

        }
        System.out.println("You made"+numOfGuesses+"guesses");

    }
}
