package controller;

import model.Book;
import model.DomesticBook;
import model.ForeignBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public static List<Book> bookList = new ArrayList<>();

    public static void showListBook(List<Book> books) {
        for (Book b : books
        ) {
            System.out.println(b);
        }
    }

    public static DomesticBook addNewDomesticBook() {
        System.out.println("Id: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        System.out.println("Tên sách: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();

        System.out.println("Tác giả: ");
        Scanner scanner2 = new Scanner(System.in);
        String author = scanner2.nextLine();

        System.out.println("Giá");
        Scanner scanner3 = new Scanner(System.in);
        int price = scanner3.nextInt();

        System.out.println("Thể loại: ");
        Scanner scanner4 = new Scanner(System.in);
        String category = scanner4.nextLine();

        System.out.println("Năm xuất bản: ");
        Scanner scanner5 = new Scanner(System.in);
        int publishBook = scanner5.nextInt();
        DomesticBook book = new DomesticBook(id, name, author, price, category, publishBook);
        return book;
    }

    public static ForeignBook addNewForeignBook() {
        System.out.println("Id: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        System.out.println("Tên sách: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();

        System.out.println("Tác giả: ");
        Scanner scanner2 = new Scanner(System.in);
        String author = scanner2.nextLine();

        System.out.println("Giá");
        Scanner scanner3 = new Scanner(System.in);
        int price = scanner3.nextInt();

        System.out.println("Thể loại: ");
        Scanner scanner4 = new Scanner(System.in);
        String category = scanner4.nextLine();

        System.out.println("Năm xuất bản: ");
        Scanner scanner5 = new Scanner(System.in);
        int publishBook = scanner5.nextInt();
        ForeignBook book = new ForeignBook(id, name, author, price, category, publishBook);
        return book;
    }

    public static void findBook(List<Book> books) {
        System.out.println("Mời bạn nhập tên sách cần tìm");
        Scanner scanner = new Scanner(System.in);
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getName().equals(input_name)) {
                System.out.println(book);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sách");
        }
    }

    public static int getBookByName(String bookName) {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getName().equals(bookName)) {
                return i;
            }
        }
        return -1;
    }

    public static void editBook(int index, Book newBook) {
        bookList.set(index, newBook);
    }

    public static Book creatNewBook() {
        System.out.println("Id: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        System.out.println("Tên sách: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();

        System.out.println("Tác giả: ");
        Scanner scanner2 = new Scanner(System.in);
        String author = scanner2.nextLine();

        System.out.println("Giá");
        Scanner scanner3 = new Scanner(System.in);
        int price = scanner3.nextInt();

        System.out.println("Thể loại: ");
        Scanner scanner4 = new Scanner(System.in);
        String category = scanner4.nextLine();

        System.out.println("Năm xuất bản: ");
        Scanner scanner5 = new Scanner(System.in);
        int publishBook = scanner5.nextInt();
        Book newBook = new DomesticBook(id, name, author, price, category, publishBook);
        return newBook;
    }

    public static double buyBook(List<Book> books) {
        System.out.println("Mời nhập tên cuốn sách muốn mua:");
        Scanner scanner = new Scanner(System.in);
        String input_name = scanner.nextLine();
        double cost = 0;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (input_name.equals(book.getName())){
                cost= book.getPrice()+book.tax();
            }
        }
        return cost;
    }

}

