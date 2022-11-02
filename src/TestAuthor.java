import java.util.ArrayList;
import java.util.Arrays;

public class TestAuthor {


    void run () {
        Author author1 = new Author("H. C.Andersen",'M',"hc@ndersen.dk");
        System.out.println("AUTHORS AND BOOKS:");
        ArrayList<Book> test = new ArrayList<>();
        Book book = new Book("test", 5, author1, test);
        Book book1 = new Book("Fyrtårnet", 3, author1, test);
        test.add(0, book);
        //Book book1 = new Book("a", 2, author1, test);
        //Book book = new Book("Klodshans", 48, author1,test );
        //Book booketwo = new Book("Kfffs", 8);
        test.add(1, book1);
        System.out.println(test.get(0).author);
        System.out.println(test.get(0).title);
        System.out.println(test.get(0).pages);
        //System.out.println(test.get(1).author);
        System.out.println(test.get(1).title);
        System.out.println(test.get(1).pages);



        /*System.out.println(book.getTitle());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthors());*/
        author1.addBook(book);
        //author1.addBook(booketwo);
        System.out.println("""
                """);
        //System.out.println(author1.books);

    }



    public static void main(String[] args) {
        new TestAuthor().run();
    }
}
