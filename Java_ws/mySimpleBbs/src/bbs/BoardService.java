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
    public ArrayList<BoardVO> getBoard(String title, String writer) {
        return db.select(title, writer);
    }

    //List
    @Override
    public void getBoardList() {
        db.getList();
    }

    //Update
    @Override
    public void updateBoard() {
        //db.update();
    }

    //Delete
    @Override
    public void removeBoard() {
        //db.delete();
    }
}