public class Book {

    private String name;
    private double price;
    private int qty;
    private Author author;

    public Book (String userName, Author finalAuthor, double userPrice, int quantity) {

        name = userName;
        price = userPrice;
        qty = quantity;
        author = finalAuthor;

    }

    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author getAuthor() {
        return author;
    }

    public String toString() {
        return "'" + name + "' " + "by " + author.getName() + " (" + author.getGender() + ") " + "at " + author.getEmail();

    }


}
