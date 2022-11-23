package book.service;

import java.util.ArrayList;

import book.vo.BookVO;

import java.util.ArrayList;

public interface IBookService {

    public void addBook(BookVO book);
    ArrayList<BookVO> searchBooks(int select, String bookInfo);
    public void updateBook(BookVO book);
    public void deleteBook(String bookName);
}