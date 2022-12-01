package bbs;

import java.sql.Timestamp;

public class BoardVO {
	private int bno;
	private int showBno;
    private String title;
    private String content;
    private String writer;
    private Timestamp date;
    private Timestamp updatedate;

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

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Timestamp getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}
	
	public int getShowBno() {
		return showBno;
	}

	public void setShowBno(int showBno) {
		this.showBno = showBno;
	}

	@Override
	public String toString() {
		return "[게시글 번호 : " + showBno + ", 제목 : " + title + ", 내용 : " + content + ", 작성자 : " + writer + ", 등록일자 : "
				+ date + ", 수정일자 : " + updatedate + "]";
	}
    

}