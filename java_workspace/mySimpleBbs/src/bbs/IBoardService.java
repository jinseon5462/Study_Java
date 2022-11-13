package bbs;

import java.util.ArrayList;

public interface IBoardService {
    public void insertBoard(BoardVO board);
    public ArrayList<BoardVO> getBoard(String writer);
    public void updateBoard(int select, String writer, String info);
    public void removeBoard(String writer, String title);
    public ArrayList<BoardVO> getBoardList();
}