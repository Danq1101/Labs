package lab2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Kniga book = new Kniga("Me", "Bibb", 45, 900);
        book.show("Bibb");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter info of new book");
        book.setNameBook(s);
        book.setAuthor(s);
        book.setNumberOfPages(s);
        book.setYear(s);
        book.show("qe");
    }
}

class Kniga{
    String author, nameBook;
    int year, numberOfPages;
    Kniga(){}
    Kniga(String author, String nameBook, int year, int numberOfPages){
        this.author = author; this.nameBook = nameBook; this.numberOfPages = numberOfPages; this.year = year;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setYear(int year) {
        this.year = year;
    }
    void show(String nameBook){
        if (this.nameBook.equals(nameBook))
            System.out.println(nameBook + " " + author + " " + numberOfPages + " " + year);
        else
            System.out.println("There is no equals");
    }

    public void setAuthor(Scanner s){
        this.author = s.nextLine();
    }

    public void setNameBook(Scanner s){
        this.nameBook = s.nextLine();
    }

    public void setNumberOfPages(Scanner s){
        this.numberOfPages = s.nextInt();
    }

    public void setYear(Scanner s){
        this.year = s.nextInt();
    }

}
