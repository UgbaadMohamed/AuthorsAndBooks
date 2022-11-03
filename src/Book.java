import java.util.ArrayList;

public class Book extends Author {
    private String title;
    private int pages;
    private Author author;



    public Book (String title, int pages, Author author) {
        super();
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
