package storage;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookFile {
    public static void writerFile(List<Book> bookList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("list.book");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(bookList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            oos.close();
            fos.close();
        }
    }
    public static List<Book> readFile(){
        File file = new File("list.book");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            List<Book> bookList = (List<Book>) result;
            ois.close();
            fis.close();
            return bookList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
