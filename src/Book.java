import java.util.ArrayList;

public class Book extends Author {


    private String title;
    private int pages;

    private Author author;

    public Author getAuthor() {
        return author;
    }

    public Book (String title, int pages, Author author, ArrayList<Book> list) {
        super();
        this.pages = pages;
        this.title = title;
        this.author=author;

    }

    /*public Book (String title, int pages) {
        this.pages = pages;
        this.title = title;
    }*/

    public String getTitle (){
        return title;
    }

    public int getPages () {
        return pages;
    }



    /*public Author getAuthors() {
        return this.author;
    }*/
            //System.out.println('\n'+  "    " +  book.getTitle() +  "                                "+ book.getPages());

    @Override
    public String toString() {
        return
                "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author=" + author +
                '}';
    }


}
