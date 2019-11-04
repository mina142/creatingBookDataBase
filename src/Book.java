public class Book {
    private String bookTitle;
    private String SKU;
    private String author;
    private String description;
    private double price;

    public Book(){}
    public Book(String bookTitle,String SKU,String author,String description,double price){
        this.author = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.SKU = SKU;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}

