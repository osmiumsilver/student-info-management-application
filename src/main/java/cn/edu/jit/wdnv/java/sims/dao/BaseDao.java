package cn.edu.jit.osmiumsilver.java.sims.dao;

import cn.edu.jit.osmiumsilver.java.sims.util.dbConnect;

import java.sql.Connection;
import java.sql.SQLException;

public class BaseDao { //基础DAO类 用来extends
    public Connection con = dbConnect.getCon();

    public void closeDao() {
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
