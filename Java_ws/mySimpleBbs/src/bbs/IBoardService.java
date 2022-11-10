package bbs;

import java.util.ArrayList;

public interface IBoardService {
    public void insertBoard(BoardVO board);
    public ArrayList<BoardVO> getBoard(String title, String writer);
    public void getBoardList();
    public void updateBoard();
    public void removeBoard();
}
