package on_tap_io_text_file.book_manager;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private static List<Book> books = new ArrayList<>();
    private final String PATH="src/on_tap_io_text_file/book_manager/book.csv";
    private CSVHelper<Book> bookCSVHelper = new CSVHelper<>();
    BookService(){
        books = getAll();
    }
    void save(Book book){
        if (book.getId()>0){
            //code edit
            int index = books.indexOf(book);
            books.set(index,book);
        }else {
            //code add
            book.setId(books.size()+1);
            books.add(book);
        }
    bookCSVHelper.writeToFileCSV(books,PATH);
    }
    void delete(int id){
        for (int i = 0; i < books.size(); i++) {
            if (id==books.get(i).getId()){
                books.remove(i);
            }
        }

    }
    List<Book> getAll(){
        List<String> lines= bookCSVHelper.readListfromCSV(PATH);
        for (String line: lines){
            String[] tmp= line.split(",");
            int id= Integer.parseInt(tmp[0]);
            String name= tmp[1];
            String author= tmp[2];
            double price= Double.parseDouble(tmp[3]);
            String des= tmp[4];
            Book book= new Book(id, name, author, price, des);
            books.add(book);
        }
        return books;
    }
    void show(List<Book> books){
        // no - align right, - align left
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-20s %-20s%n", "ID", "NAME", "AUTHOR", "PRICE", "DESCRIPTION");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (Book book : books){
            System.out.format("%-10d %-20s %-20s %-20.2f %-20s%n", book.getId(), book.getName(), book.getAuthor(), book.getPrice(), book.getDescription());
        }
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    void show(){
        show(books);
    }

}
