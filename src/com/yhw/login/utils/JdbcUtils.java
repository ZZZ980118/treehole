package com.yhw.login.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {


    private static ComboPooledDataSource cpds=new ComboPooledDataSource();

    public static Connection getConnection(){
        Connection conn=null;
        try {
            conn = cpds.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }

    public static void closeAll(ResultSet rs, Statement stmt,Connection conn){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    public static void closeAll(Statement stmt,Connection conn){
        closeAll(null,stmt,conn);
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }


}
