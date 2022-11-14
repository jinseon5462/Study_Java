package mydiary;

import java.util.ArrayList;

public interface IDao {
    public void insert(Diary diary);
    public ArrayList<Diary> selectAll();
    public Diary selectOne(String dno);
}
