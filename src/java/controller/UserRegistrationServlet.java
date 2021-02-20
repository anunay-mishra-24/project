package controller;

import bean.UserRegistrationBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserRegistrationDao;

public class UserRegistrationServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String pass = request.getParameter("pass");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String dob = request.getParameter("dob");
       // String cpass = request.getParameter("cpass");
        String col = request.getParameter("col");
        String gen = request.getParameter("gen");
        String pic = request.getParameter("pic");

        UserRegistrationBean obj = new UserRegistrationBean();
        obj.setFname(fname);
        obj.setLname(lname);
        obj.setPass(pass);
        obj.setEmail(email);
        obj.setMobile(mobile);
        obj.setDob(dob);
        obj.setCol(col);
        obj.setGen(gen);
        obj.setPic(pic);
        int x = new UserRegistrationDao().UserRegistration(obj);
        if (x > 0) {
            System.out.println("......hghfghfgh........");
            response.sendRedirect("login.html");
        } 
        else {
            System.out.println("ggg");
            response.sendRedirect("index.html?err=101/User_Already_Existed!");

        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
