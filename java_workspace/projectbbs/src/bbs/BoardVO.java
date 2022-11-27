package bbs;

import java.sql.Timestamp;

public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Timestamp date;
	private Timestamp updatedate;
	private int view;
	
	public BoardVO() {}
	
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

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	@Override
	public String toString() {
		return "[게시글 번호 : " + bno + ", 게시글 제목 : " + title + ", 게시글 내용 : " + content + ", 게시글 작성자 : " + writer + ", 게시글 작성일 : "
				+ date + ", 게시글 수정일 : " + updatedate + ", 게시글 조회수 : " + view + "]";
	}
}
