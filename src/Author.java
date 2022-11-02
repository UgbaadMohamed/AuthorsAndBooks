import java.util.ArrayList;
import java.util.Arrays;

public class Author {
    private String name;
    private String email;
    private char køn;
    ArrayList<Book> books = new ArrayList<Book>();
    public Author (String name, char køn, String email) {
        this.name = name;
        this.email = email;
        this.køn = køn;
    }
    public Author() {

    }
    public String getName () {
        return name;
    }

    public char getKøn () {
        return køn;
    }

    public String getEmail () {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    public void addBook (Book book) {
        books.add(book);
        System.out.println('\n'+  "    " +  book.getTitle() +  "                                "+ book.getPages());

    //Author forfatter1 = new Author("H. C.Andersen",'M',"hc@ndersen");
    //Author forfatter2 = new Author("J. K. Rowling",'F',"jk@rowling.co.uk");
    //Author forfatter3 = new Author("Søren Kirkegård",'M',"kirkeg@rd.dk");
    }

    }


