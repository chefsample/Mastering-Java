class TestMovies{
  public static void main(String args[]){
    Movies one = new Movies();
    one.title = "JaiLavaKusa";
    one.genre = "Action";
    one.rating = (int) 2.75;
    Movies two = new Movies();
    two.title = "PSPK25";
    two.genre = "Action/Comedy";
    two.rating = 4;
    two.playIt();
    Movies three = new Movies();
    three.rating = 2;
    three.playIt();
  }
}
