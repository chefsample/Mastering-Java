package book;
//https://www.hackerrank.com/challenges/30-abstract-classes/problem
abstract class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
