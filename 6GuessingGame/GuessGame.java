public class GuessGame{
  Player p1;
  Player p2;
  Player p3;


  public void startGame(){
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    boolean isp1Right = false;
    boolean isp2Right = false;
    boolean isp3Right = false;

    int targetNumber = 0;
    targetNumber = (int) (Math.random()*10);
    System.out.println("System Generated number is" +targetNumber);

    while(true){
    p1.guess();
    p2.guess();
    p3.guess();


    guessp1 = p1.number;
    System.out.println("Player one guessed" +guessp1);
    guessp2 = p2.number;
    System.out.println("Player one guessed" +guessp2);
    guessp3 = p3.number;
    System.out.println("Player one guessed" +guessp3);


      if(guessp1 == targetNumber){
        isp1Right = true;}
      if (guessp2 == targetNumber){
        isp2Right = true;}
      if( guessp3 == targetNumber){
        isp3Right = true;}

    if(isp1Right || isp2Right || isp3Right){
      System.out.println("Player one " +isp1Right);
      System.out.println("Player two " +isp2Right);
      System.out.println("Player three " +isp3Right);
      break;
    }
    else{
      System.out.println("Try Again");
    }
    }
}
}
