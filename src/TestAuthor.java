
import java.util.ArrayList;

public class TestAuthor {

    void run () {

        ArrayList<Book> test = new ArrayList<>();
        System.out.println("AUTHORS AND BOOKS:");
        //Oprettelse af de tre instancere (Authors)

        Author author1 = new Author("H. C.Andersen  ",'M',  " hc@ndersen.dk");
        Author author2 = new Author("J.K.Rowling    ",'F'," k@rowling.co.uk");
        Author author3 = new Author("Søren Kirkegård",'M',"  kirkeg@rd.dk");


        //Oprettelse af arraylist af bøger.

       Book BookOne = new Book("Klodshans", 66, author1, test);
        Book Booktwo = new Book("Fyrtårnet", 37, author1, test);
        Book Bookthree = new Book("Harry Potter - Part 1", 437, author2, test);
        Book Bookfour = new Book("Harry Potter - Part 2", 652, author2, test);
        Book Bookfive = new Book("Harry Potter - Part 3", 318, author2, test);
        Book Booksix = new Book("Harry Potter - Part 4", 445, author2, test);
        Book Bookseven = new Book("Filosofiens grundviden", 912, author3, test);
        Book Bookeigth = new Book("Filopsofi for viderkomne", 713, author3, test);
        Book Booknine = new Book("Avanceret akademisk filosofi", 599, author3, test);


        //Tilføje til Arraylisten.
        test.add(0, BookOne);
        test.add(1, Booktwo);
        test.add(2, Bookthree);
        test.add(3, Bookfour);
        test.add(4, Bookfive);
        test.add(5, Booksix);
        test.add(6, Bookseven);
        test.add(7, Bookeigth);
        test.add(8, Booknine);


        //Udprintet af Hc.Andersen og hans bøger.
        System.out.println(test.get(1).getAuthor());
        System.out.print(test.get(0).getTitle());
        System.out.println("                            " +test.get(0).getPages());
        System.out.println(test.get(1).getAuthor());
        System.out.print(test.get(0).getTitle());
        System.out.println("                            " +test.get(0).getPages());
        System.out.print(test.get(1).getTitle());
        System.out.println("                            " +test.get(1).getPages());

        //Udprintet af J.K.Rowling og hendes bøger.
        System.out.println(test.get(2).getAuthor());
        System.out.print(test.get(2).getTitle());
        System.out.println("                " +test.get(2).getPages());
        System.out.print(test.get(3).getTitle());
        System.out.println("                " +test.get(3).getPages());
        System.out.print(test.get(4).getTitle());
        System.out.println("                " +test.get(4).getPages());
        System.out.print(test.get(5).getTitle());
        System.out.println("                " +test.get(5).getPages());

        //Udprintet af Søren Kiregård og hans bøger.
        System.out.println(test.get(6).getAuthor());
        System.out.print(test.get(6).getTitle());
        System.out.println("               " +test.get(6).getPages());
        System.out.print(test.get(7).getTitle());
        System.out.println("             " +test.get(7).getPages());
        System.out.print(test.get(8).getTitle());
        System.out.println("         " +test.get(8).getPages());

    }
    public static void main(String[] args) {
        new TestAuthor().run();
    }
}
