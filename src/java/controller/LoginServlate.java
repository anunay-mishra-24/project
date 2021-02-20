package controller;

import bean.UserRegistrationBean;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserRegistrationDao;

public class LoginServlate extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usn = request.getParameter("email");
        String pwd = request.getParameter("pass");
        UserRegistrationBean sbean = new UserRegistrationDao().authenticate(usn, pwd);
        if (sbean.getEmail() != null) {
            HttpSession sessionObj = null;
            sessionObj = request.getSession();
            sessionObj.setAttribute("email", sbean.getEmail());
            sessionObj.setAttribute("fname", sbean.getFname());
            sessionObj.setAttribute("lname", sbean.getLname());
            sessionObj.setAttribute("col", sbean.getCol());
            sessionObj.setAttribute("pass", sbean.getPass());
            sessionObj.setAttribute("mobile", sbean.getMobile());
            sessionObj.setAttribute("dob", sbean.getDob());
            sessionObj.setAttribute("gen", sbean.getGen());
            sessionObj.setAttribute("pic", sbean.getPic());
            response.sendRedirect("viewprofile.jsp");
        } else {
            response.sendRedirect("login.html?err=invaliduser");
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
