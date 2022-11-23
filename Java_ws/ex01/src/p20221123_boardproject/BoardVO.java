package p20221123_boardproject;

import java.util.Date;

public class BoardVO {
    private int showBno;
    private int dbBno;
    private String title;
    private String content;
    private String writer;

    public BoardVO(){}

    public BoardVO(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getShowBno() {
        return showBno;
    }

    public void setShowBno(int showBno) {
        this.showBno = showBno;
    }

    public int getDbBno() {
        return dbBno;
    }

    public void setDbBno(int dbBno) {
        this.dbBno = dbBno;
    }
}
