package bbs;

import java.util.ArrayList;

public class BoardDB {
    ArrayList<BoardVO> bList = new ArrayList<>();

    public void create(BoardVO board){
        bList.add(board);
    }

    public ArrayList<BoardVO> select(String writer){
        ArrayList<BoardVO> list = new ArrayList<>();
        for(int i = 0; i < bList.size(); i++){
            if(bList.get(i).getWriter().contains(writer)){
                list.add(bList.get(i));
            }
        }
        return list;
    }

    public void update(int select, String writer, String info){
        for(BoardVO b : bList){
            if(b.getWriter().equals(writer) && select == 1){
                b.setTitle(info);
            }
            if(b.getWriter().equals(writer) && select == 2){
                b.setContents(info);
            }
        }
    }

    public void delete(String writer, String title){
        for(int i = 0; i < bList.size(); i++){
            if(bList.get(i).getWriter().equals(writer) && bList.get(i).getTitle().equals(title)){
                bList.remove(i);
            }
        }
    }

    public ArrayList<BoardVO> getList(){
        return bList;
    }
}