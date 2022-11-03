import java.awt.print.Book;
import java.util.ArrayList;

public class TestAuthor {

    void run () {

        //Udskrivelse af overskrift.
        System.out.println("AUTHORS AND BOOKS:");

        //Oprettelse af de tre instancere (Authors)

        Author author1 = new Author("H. C.Andersen  ",'M',  " hc@ndersen.dk");
        Author author2 = new Author("J.K.Rowling    ",'F'," k@rowling.co.uk");
        Author author3 = new Author("Søren Kirkegård",'M',"  kirkeg@rd.dk");


        //Oprettelse af arraylist af bøger.
        Book BookOne = new Book();
        Book Booktwo = new Book("Fyrtårnet", 37, author1);

        Book Bookthree = new Book("Harry Potter - Part 1", 437, author2);
        Book Bookfour = new Book("Harry Potter - Part 2", 652, author2);
        Book Bookfive = new Book("Harry Potter - Part 3", 318, author2);
        Book Booksix = new Book("Harry Potter - Part 4", 445, author2);
        Book Bookseven = new Book("Filosofiens grundviden", 912, author3);
        Book Bookeigth = new Book("Filopsofi for viderkomne", 713, author3);
        Book Booknine = new Book("Avanceret akademisk filosofi", 599, author3);

        author1.books.add(0,BookOne);


        //Tilføje til Arraylisten.
        author1.bookArrayList.add(0,BookOne);



       /* books.add(2, Bookthree);
        books.add(3, Bookfour);
        books.add(4, Bookfive);
        books.add(5, Booksix);
        books.add(6, Bookseven);
        books.add(7, Bookeigth);
        books.add(8, Booknine);


        //Udprintet af Hc.Andersen og hans bøger.
        System.out.println(books.get(1).getAuthor());
        System.out.print(books.get(0).getTitle());
        System.out.println("                             " +books.get(0).getPages());
        System.out.println(books.get(1).getAuthor());
        System.out.print(books.get(0).getTitle());
        System.out.println("                             " +books.get(0).getPages());
        System.out.print(books.get(1).getTitle());
        System.out.println("                             " +books.get(1).getPages());

        //Udprintet af J.K.Rowling og hendes bøger.
        System.out.println(books.get(2).getAuthor());
        System.out.print(books.get(2).getTitle());
        System.out.println("                " +books.get(2).getPages());
        System.out.print(books.get(3).getTitle());
        System.out.println("                " +books.get(3).getPages());
        System.out.print(books.get(4).getTitle());
        System.out.println("                " +books.get(4).getPages());
        System.out.print(books.get(5).getTitle());
        System.out.println("                " +books.get(5).getPages());

        //Udprintet af Søren Kiregård og hans bøger.
        System.out.println(books.get(6).getAuthor());
        System.out.print(books.get(6).getTitle());
        System.out.println("               " +books.get(6).getPages());
        System.out.print(books.get(7).getTitle());
        System.out.println("             " +books.get(7).getPages());
        System.out.print(books.get(8).getTitle());
        System.out.println("         " +books.get(8).getPages());
*/
    }
    public static void main(String[] args) {
        new TestAuthor().run();
    }
}
