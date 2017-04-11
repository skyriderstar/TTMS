package cn.taihe.ird.dbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/zjl";
    private static final String DBUSER = "root";
    private static final String DBPWD = "1116";
    private Connection conn = null;

    public DatabaseConnection() throws Exception {
        try {
            Class.forName(DBDRIVER);
            this.conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
        } catch (Exception e) {
            throw e;
        }
    }

    public  Connection getConn() {
        return this.conn;
    }

    public  void close() throws Exception {
        if (this.conn != null) {
            try {
                this.conn.close();
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
