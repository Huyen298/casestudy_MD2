package view;

import controller.Manager;
import model.Book;
import model.DomesticBook;
import model.ForeignBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        DomesticBook b1 = new DomesticBook("001","Tôi thấy hoa vàng trên cỏ xanh","Nguyễn Nhật Ánh",120,"Văn học",2010);
        DomesticBook b2 = new DomesticBook("002","Bàn có năm chỗ ngồi","Nguyễn Nhật Ánh",100,"Văn học",2012);
        DomesticBook b3= new DomesticBook("003","Toán lớp 1","Author 1",50,"Sách giáo khoa",2009);
        DomesticBook b4 = new DomesticBook("004","Toán lớp 2","Author 2",60,"Sách giáo khoa",2000);
        DomesticBook b5 = new DomesticBook("005","Tuổi trẻ đáng giá bao nhiêu","Rosie Nguyễn ",90,"Kĩ năng",2016);
        ForeignBook b6 = new ForeignBook("006","Trên đường băng","Tony",85,"Kĩ năng",2018);
        ForeignBook b7 = new ForeignBook("007","Đắc nhân tâm","Dale Carnegie",95,"Kĩ năng",2017);
        ForeignBook b8 = new ForeignBook("008","Hoàng tử bé","Antoine",45,"Văn học",2018);
        ForeignBook b9 = new ForeignBook("009","Túp lều bác Tôm","Stowe",115,"Văn học",2010);
        ForeignBook b10 = new ForeignBook("010","Nghìn lẻ một đêm","Antoine",185,"Cổ tích",2018);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
        books.add(b9);
        books.add(b10);
        Manager.bookList=books;
        int choice= -1;
        Scanner input= new Scanner(System.in);
        while (choice!=0){
            System.out.println("1. Hiển thị sách ");
            System.out.println("2. Thêm sách trong nước ");
            System.out.println("3. Thêm sách nước ngoài ");
            System.out.println("4.Tìm sách ");
            System.out.println("5. Sửa thông tin sách");
            System.out.println("6. Mua sách");
            System.out.println("7. Sách đang được giảm giá");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    Manager.showListBook(books);
                    break;
                case 2:
                    books.add(Manager.addNewDomesticBook());
                    Manager.showListBook(books);
                    break;
                case 3:
                    books.add(Manager.addNewForeignBook());
                    Manager.showListBook(books);
                    break;
                case 4:
                    Manager.findBook(books);
                    break;
                case 5:
                    System.out.println("Nhập tên sách muốn sửa thông tin");
                    Scanner scanner = new Scanner(System.in);
                    String input_name = scanner.nextLine();
                    int index = Manager.getBookByName(input_name);
                    Manager.editBook(index, Manager.creatNewBook());
                    Manager.showListBook(books);
                    break;
                case 6:
                    System.out.println("Giá tiền của cuốn sách là: "+Manager.buyBook(books));
            }
        }
    }
}
