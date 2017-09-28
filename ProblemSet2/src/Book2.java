public class Book2 {

    private String title, isbn;
    private double price;
    private int pages;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book2(){
        this("Unknown", "Unknown", 0, 0.00);
    } // This is Constructor Method!!

    public Book2(String title, String isbn, int pages, double price) {

        setTitle(title);
        setIsbn(isbn);
        setPages(pages);
        setPrice(price);
    } //This is also a constructor method!!!!!

    public String toString() {
        return String.format("\n%-20s%-20s\n%-20s%-20s\n%-20s%-20d\n%-20s%.2f €", "Title:",
                getTitle(),"ISBN:", getIsbn(),"Number of Pages:", getPages(),"Price:", getPrice());
    }
}
