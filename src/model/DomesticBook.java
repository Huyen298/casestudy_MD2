package model;

import model.Book;

public class DomesticBook extends Book {

    @Override
    public double tax() {
        double tax = getPrice()*0.08;
        return tax;

    }

    public DomesticBook() {
    }

    public DomesticBook(String id, String name, String author, int price, String category,int publishYear) {
        super(id, name, author, price, category, publishYear);
    }

    @Override
    public String toString() {
        return "Domestic{id: "+
    getId()+" ,name: "+getName()+
    ", author: "+getAuthor()+
    ", price: "+getPrice()+
    ", category: "+getCategory()+
    ", publishYear: "+getPublishYear()+"}";
    }

}
