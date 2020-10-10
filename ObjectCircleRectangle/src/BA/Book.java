package BA;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Author[] getAuthors() {
        return authors;
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

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){
        String ans = "";
        for(int i = 0;i < authors.length;i++){
            if(i != 0)
                ans += ",";
            ans += authors[i].getName();
        }
        return ans;
    }

    public static void main(String[] args) {
        Author a = new Author("zy","12345678@qq.com",'m');
        Author b = new Author("haha", "222222@mail.com",'f');
        Author[] authors = new Author[]{a,b};
        Book b1 = new Book("Good Book", authors , 18.0);
        Book b2 = new Book("Bad Book", authors, 200.0, 1);
        System.out.println(b1);
        System.out.println(b1.getAuthors());
        System.out.println(b1.getName());
        System.out.println(b1.getPrice());
        b1.setPrice(20.0);
        System.out.println(b1.getPrice());
        System.out.println(b2.getQty());
        b2.setQty(2);
        System.out.println(b2.getQty());
        System.out.println(b1.getAuthorNames());
    }
}
