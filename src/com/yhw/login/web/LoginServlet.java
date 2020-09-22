package com.yhw.login.web;

import com.yhw.login.bean.User;
import com.yhw.login.service.LoginService;
import jdk.nashorn.internal.ir.CallNode;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hjd
 * @version v1.0
 * @date 2020/9/22/022 18:12
 * @description TODO
 **/
@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决乱码
        request.setCharacterEncoding("UTF-8");
        //获取html传过来的数据
        String username = request.getParameter("username");
        String content = request.getParameter("content");

        //把传过来的数据封装javabean
        User user =new User();
        user.setUsername(username);
        user.setContent(content);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        String timestamp = sdf.format(new Date());
        user.setDate(timestamp);

        //处理数据
        LoginService loginService = new LoginService();
        User user1=loginService.login(user);

        if (user1!=null){
            System.out.println("成功");
            System.out.println(user1);
        }else{
            System.out.println("失败");
        }

    }
}