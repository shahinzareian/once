public class Book {
    private String bookName;
    private double price;
    private int quantity;
    Author author;
    private int year;

    public Book(String bookName, double price, int quantity, Author author, int year) {
        this.bookName = bookName;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}
