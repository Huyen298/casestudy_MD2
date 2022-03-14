package model;

public class ForeignBook extends Book {
    @Override
    public double tax() {
        double tax = getPrice()*0.1;
        return tax;
    }

    public ForeignBook() {
    }

    public ForeignBook(String id, String name, String author, int price, String category, int publishYear) {
        super(id, name, author, price, category,  publishYear);
    }

    @Override
    public String toString() {
        return "Foreign{id: "+
        getId()+" ,name: "+getName()+
                ", author: "+getAuthor()+
                ", price: "+getPrice()+
                ", category: "+getCategory()+
                ", publishYear: "+getPublishYear()+"}";
    }
}
