package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.UserRegistrationBean;
import model.UserRegistrationDao;

public final class viewprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    HttpSession sessionObj = request.getSession(false);
    String email = (String) sessionObj.getAttribute("email");
    String pass = (String) sessionObj.getAttribute("pass");
    UserRegistrationBean obj = new UserRegistrationDao().getUserByEmail(email);

      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=yes\">\n");
      out.write("        <title>login</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrapmy.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body style=\"background-color: #660033;\">\n");
      out.write("        <div class=\"container register\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 register-left\">\n");
      out.write("                    <img src=\"css/logo_white.png\" alt=\"\"/>\n");
      out.write("                    <h3>Welcome</h3>\n");
      out.write("                    <p>You Are Logged In!!</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9 register-right\">\n");
      out.write("                    <h3 align=\"center\"><span style=\"color:#1BBD36;\"> \n");
      out.write("                            ");
      out.print( obj.getFname() + " " + obj.getLname());
      out.write("'s\n");
      out.write("                        </span> Profile</h3>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-10\" >\n");
      out.write("                        <div class=\"media \" style=\"margin-left:190px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <table class=\"table bordered\">\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><span style=\"color:#6e6e6e;\">Full Name:</span></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <span style=\"color:#6e6e6e;\">\n");
      out.write("                                            ");
      out.print( obj.getFname() + " " + obj.getLname());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><span style=\"color:#6e6e6e;\">Date Of Birth:</span></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <span style=\"color:#6e6e6e;\">\n");
      out.write("                                            ");
      out.print( obj.getDob());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><span style=\"color:#6e6e6e;\">Gender:</span></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <span style=\"color:#6e6e6e;\">\n");
      out.write("                                            ");
      out.print( obj.getGen());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><span style=\"color:#6e6e6e;\">College:</span></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <span style=\"color:#6e6e6e;\">\n");
      out.write("                                            ");
      out.print( obj.getCol());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><span style=\"color:#6e6e6e;\">Email:</span></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <span style=\"color:#6e6e6e;\">\n");
      out.write("                                            ");
      out.print( obj.getEmail());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><span style=\"color:#6e6e6e;\">Mobile:</span></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <span style=\"color:#6e6e6e;\">\n");
      out.write("                                            ");
      out.print( obj.getMobile());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><span style=\"color:#6e6e6e;\">Password:</span></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <span style=\"color:#6e6e6e;\">\n");
      out.write("                                            ");
      out.print( obj.getPass());
      out.write("\n");
      out.write("                                        </span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-12 register-left\">\n");
      out.write("            <a href=\"login.html\"><button type=\"submit\" class=\"btn btn-primary btn-lg\" name=\"btn_registration\">Sign Out</button></a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
