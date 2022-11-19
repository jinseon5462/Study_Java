package book.vo;

public class BookVO {
    private String bookCode;
    private String bookName;
    private String author;
    private String publisher;
    private int price;

    public BookVO(String bookCode, String bookName, String author, String publisher, int price) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
    public String getBookCode() {
        return bookCode;
    }
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "BookVO [도서코드 : " + bookCode + ", 도서명 : " + bookName + ", 저자 : " + author + ", 출판사 : "
                + publisher + ", 가격 : " + price + "]";
    }
}