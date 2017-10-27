import java.io.*;

public class GameHelper{
  public String getUserInput(String prompt){
    String inputLine = null;
    System.out.print(prompt+"");
    try{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      inputLine = in.readLine();
      if(inputLine.length() == 0)
          return null;
      } catch(IOException e){
        System.out.println("IOException" +e);
      }
      return inputLine;

    }
  }
