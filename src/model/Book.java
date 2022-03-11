package model;

import java.io.Serializable;

public abstract class Book implements Comparable<Book>, Serializable {
    private String id;
    private String name;
    private String author;
    private int price;
    private String category;
    private int publishYear;

    @Override
    public int compareTo(Book o) {
        return this.price - o.getPrice();
    }

    public abstract double tax();

    public Book() {
    }

    public Book(String id, String name, String author, int price, String category,int publishYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.category = category;
        this.publishYear = publishYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }
}
