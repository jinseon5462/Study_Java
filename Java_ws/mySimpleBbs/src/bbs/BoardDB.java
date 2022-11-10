package bbs;

import java.util.ArrayList;

public class BoardDB {
    ArrayList<BoardVO> bList = new ArrayList<>();

    public void create(BoardVO board){
        bList.add(board);
    }

    public ArrayList<BoardVO> select(String title, String writer){
        ArrayList<BoardVO> list = new ArrayList<>();
        for(int i = 0; i < bList.size(); i++){
            if(bList.get(i).getTitle().contains(title)){
                list.add(bList.get(i));
            }
        }
        return list;
    }

    public void update(BoardVO board){
        for(int i = 0; i < bList.size(); i++){
            if(bList.get(i).getWriter().equals(board.getWriter())){
                bList.set(i, board);
            }
        }
    }

    public void delete(BoardVO board){
        for(int i = 0; i < bList.size(); i++){
            if(bList.get(i).getWriter().equals(board.getWriter())){
                bList.remove(i);
            }
        }
    }

    public void getList(){

    }
}