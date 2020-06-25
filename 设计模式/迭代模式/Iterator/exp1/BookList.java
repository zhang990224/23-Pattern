package Iterator.exp1;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> bookList;
    private int index;

    public BookList() {
        bookList = new ArrayList<Book>();
    }

    //添加书籍
    public void addBook(Book book){
        bookList.add(book);
    }

    //删除书籍
    public void deleteBook(Book book){
        int bookIndex = bookList.indexOf(book);
        bookList.remove(bookIndex);
    }

    //判断是否有下一本书
    public boolean hasNext(){
        if (index>= bookList.size()){
            return false;
        }
        return true;
    }

    //获取下一本书
    public Book getNext(){
        return bookList.get(index++);
    }

    public List<Book> getBookList(){
        return bookList;
    }

}
