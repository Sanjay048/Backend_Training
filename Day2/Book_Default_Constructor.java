package Day2;

public class Book_Default_Constructor {
    private String title;
    private String author;

    public Book_Default_Constructor(){
        this.title="Unknown";
        this.author="Nil";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void displayBookDetails(){
        System.out.println("Title : "+title+"\nAuthor : "+author);
    }

    public static void main(String[] args) {
        Book_Default_Constructor bk1 = new Book_Default_Constructor();
        bk1.displayBookDetails();

        bk1.setAuthor("Robert Kiyosaki");
        bk1.setTitle("Rich Dad Poor Dad");
        bk1.displayBookDetails();
    }
}
