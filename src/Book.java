public class Book extends Author {


    private String title;
    private int pages;

    private Author author;

    public Book (String title, int pages, Author author ) {
        super();
        this.pages = pages;
        this.title = title;
        this.author=author;

    }

    public String getTitle (){
        return title;
    }

    public int getPages () {
        return pages;
    }

    public Author getAuthors() {
        return this.author;
    }


}
