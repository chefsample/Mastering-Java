package book;
//https://www.hackerrank.com/challenges/30-abstract-classes/problem
class MyBook extends Book {
    int price;
    MyBook(String title,String author,int price){
        super(title,author);
        this.price = price;

    }
    public void display(){
        System.out.println("Title: " +title+"\nAuthor: "+author+"\nPrice: "+price);
    }
}
