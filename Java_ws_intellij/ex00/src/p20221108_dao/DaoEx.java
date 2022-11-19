package p20221108_dao;

public class DaoEx {
    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }

    private static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
}
