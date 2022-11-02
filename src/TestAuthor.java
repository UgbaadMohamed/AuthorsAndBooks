import java.util.Arrays;

public class TestAuthor {
    void run () {
        Author author1 = new Author("H. C.Andersen",'M',"hc@ndersen.dk");
        System.out.println("AUTHORS AND BOOKS:");
        System.out.print(author1.getName());
        System.out.print("           " + author1.getKøn());
        System.out.print("      " + author1.getEmail());
        author1.addBook(new Book("Fyrtøjet",37,author1));

    }

      //  Book one  = new Book("fyrtøjet",437,author);
        //System.out.println(one.getTitle() + one.getPages() + one.getAuthors(1) );



       //Book oneAndersen = new Book("H. C.Andersen",'M',"hc@ndersen","Klods-Hans","aa" );


    //  Books twoAndersen = new Books("H. C.Andersen",'M',"hc@ndersen","fyrtøjet",37 );
      // Books oneRowling = new Books("J. K. Rowling",'F',"jk@rowling.co.uk","Harry Potter Part 1",437 );
      //    Books twoRowling = new Books("J. K. Rowling",'F',"jk@rowling.co.uk","Harry Potter Part 2",652 );
     //   Books threeRowling = new Books("J. K. Rowling",'F',"jk@rowling.co.uk","Harry Potter Part 3",318 );
    //    Books fourRowling = new Books("J. K. Rowling",'F',"jk@rowling.co.uk","Harry Potter Part 4",445 );
     //   Books oneKirkegård = new Books("Søren Kirkegård",'M',"kirkeg@rd.dk","filosofiens grundviden",912 );
     //   Books twoKirkegård = new Books("Søren Kirkegård",'M',"kirkeg@rd.dk","filopsofi for viderkomne",713 );
     //   Books threeKirkegård = new Books("Søren Kirkegård",'M',"kirkeg@rd.dk","Avancewret akademisk filosofi",599 );




    public static void main(String[] args) {
        new TestAuthor().run();
    }
}
