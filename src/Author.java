import java.util.ArrayList;
import java.util.Arrays;

public class Author {
    public String name;
    public String email;
    public char køn;
    public Book[] book;
    ArrayList<Book> books = new ArrayList<>();

    @Override
   public String toString() {
        return  name + '\'' +
                ", email='" + email + '\'' +
                ", køn=" + køn
                ;
    }

    public Author (String name, char køn, String email) {
        this.book=book;
        this.name = name;
        this.køn = køn;
        this.email = email;
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

    //Author forfatter1 = new Author("H. C.Andersen",'M',"hc@ndersen");
    //Author forfatter2 = new Author("J. K. Rowling",'F',"jk@rowling.co.uk");
    //Author forfatter3 = new Author("Søren Kirkegård",'M',"kirkeg@rd.dk");
    }

}


