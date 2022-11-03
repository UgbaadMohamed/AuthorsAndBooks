import java.awt.print.Book;
import java.util.ArrayList;

public class Author {
    private String name;
    private String email;
    private char køn;

    ArrayList<Book> books = new ArrayList<>();

    public Author(String name, char køn, String email) {
        this.name = name;
        this.køn = køn;
        this.email = email;
    }

    public Author() {
    }

    public String getName() {
        return name;
    }

    public char getKøn() {
        return køn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + "   " + køn +
                "       " + email
                ;
    }

}



