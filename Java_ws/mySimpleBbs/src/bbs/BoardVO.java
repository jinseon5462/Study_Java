package bbs;

public class BoardVO {

    private String bno;
    private String title;
    private String contents;
    private String writer;

    public BoardVO(String title, String contents, String writer){
        this.title = title;
        this.contents = contents;
        this.writer = writer;
    }

    public String getBno() {
        return bno;
    }

    public void setBno(String bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String toString(){
        return "[게시글 번호 : " + bno + ", 제목 : " + title
                 + ", 내용 : " + contents + ", 작성자 : " + writer + "]";
    }
}
