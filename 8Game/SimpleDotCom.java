

public class SimpleDotCom{

    int[] locationcells;
    int numOfHits = 0;

    public String checkYourself(String userGuess){
      int guess = Integer.parseInt(userGuess);
      String result = "miss";

      for(int cell:locationcells) {

          if (guess == cell) {
              result = "Hit";
              numOfHits++;
              break;
          }
          if (numOfHits == locationcells.length) {
              result = "Kill";
          }
      }
      System.out.println(result);
      return result;


    }

    public void setLocationCells(int[] locs){
       locationcells = locs;
    }

  }
