package bbs;

import java.util.ArrayList;

public class BoardService implements IBoardService{
    BoardDB db = new BoardDB();

    //Create
    @Override
    public void insertBoard(BoardVO board) {
        db.create(board);
    }

    //Read
    @Override
    public ArrayList<BoardVO> getBoard(String writer) {
        return db.select(writer);
    }

    //Update
    @Override
    public void updateBoard(int select, String writer, String info) {
        db.update(select, writer, info);
    }

    //Delete
    @Override
    public void removeBoard(String writer, String title) {
        db.delete(writer, title);
    }

    //List
    @Override
    public ArrayList<BoardVO> getBoardList() {
        return db.getList();
    }
}