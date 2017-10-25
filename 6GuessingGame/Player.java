class Player{
  int number = 0;

  void guess(){
    number = (int) (Math.random()*10);
    System.out.println("The number Guessed is:" + number);
  }
}
