package mydiary;

public class Diary {
    private String dno;
    private Date date;
    private String title;
    private String content;

    public Diary(Date date, String title , String content){
        this.dno = date.toString();
        this.date = date;
        this.title = title;
        this.content = content;
    }

    public Diary(String dno, Date date, String title , String content){
        this.dno = dno;
        this.date = date;
        this.title = title;
        this.content = content;
    }


    public String getDno() {
        return dno;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return dno + "," + date + "," + title + "," + content;
    }
}
