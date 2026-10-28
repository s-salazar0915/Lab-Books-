public class book {
    String BookTitle;
    String BookAuthor;
    int BookPages = 200;

    public book(String Title, String Author, int Pages){
        BookTitle = Title;
        BookAuthor = Author;
        BookPages = Pages;
    }

    public book(String Title, String Author){
        BookTitle = Title;
        BookAuthor = Author;
    }
}
