package Iterator.exp2_iterator;

import java.util.Iterator;
import java.util.List;

public class MainTest {
    public static void main(String[]args){
        BookList bookList = new BookList();

        Book book1 = new Book("001234","Java编程思想",50);
        Book book2 = new Book("001237","C++入门到放弃",49);

        bookList.addBook(book1);
        bookList.addBook(book2);

//        while (bookList.hasNext()){
//            Book book = bookList.getNext();
//            book.display();
//        }
//
//        List<Book> bookDateList = bookList.getBookList();
//        for (int i = 0;i<bookDateList.size();i++){
//            Book book = bookDateList.get(i);
//            book.display();
//        }
        Iterator iterator = bookList.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            book.display();
        }
    }
}
