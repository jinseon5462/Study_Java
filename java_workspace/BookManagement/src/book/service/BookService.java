package book.service;

import java.util.ArrayList;

import book.vo.BookVO;

public class BookService implements IBookService{
    ArrayList<BookVO> bookList = new ArrayList<BookVO>();

    public void addBook(BookVO book) {
        bookList.add(book);
    }

    public ArrayList<BookVO> searchBooks(int select, String info) {
        ArrayList<BookVO> list = new ArrayList<BookVO>();
        if(select == 1) {
            for(int i = 0; i < bookList.size(); i++) {
                if(bookList.get(i).getBookName().contains(info)) {
                    list.add(bookList.get(i));
                }
            }
        }else if(select == 2) {
            for(int i = 0; i < bookList.size(); i++) {
                if(bookList.get(i).getAuthor().contains(info)) {
                    list.add(bookList.get(i));
                }
            }
        }else if(select == 3) {
            for(int i = 0; i < bookList.size(); i++) {
                if(bookList.get(i).getPublisher().contains(info)) {
                    list.add(bookList.get(i));
                }
            }
        }
        return list;
    }

    // Update
    @Override
    public void updateBook(BookVO book) {
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).equals(book)) {
                bookList.set(i, book);
            }
        }
    }

    // Delete
    @Override
    public void deleteBook(String bookName) {
        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getBookName().equals(bookName)) {
                bookList.remove(i);
            }
        }
    }
}