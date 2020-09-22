package com.yhw.login.dao;

import com.yhw.login.bean.User;
import com.yhw.login.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public User login(User user) {
        User u=null;
        try {
            Connection conn = JdbcUtils.getConnection();
            String sql="insert into t_user values (null,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,user.getUsername());
            pstmt.setString(2,user.getContent());
            pstmt.setString(3,user.getDate());

//            ResultSet rs = pstmt.executeQuery();
//            if (rs.next()){
//                u = new User(
//                        rs.getInt("id"),
//                        rs.getString("username"),
//                        rs.getString("content"),
//                        rs.getString("date"));
//            }
            int i = pstmt.executeUpdate();
            if (i>0){
                System.out.println("插入成功");
            }else
                System.out.println("插入失败");


//            JdbcUtils.closeAll(rs,pstmt,conn);


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return u;
    }
}
