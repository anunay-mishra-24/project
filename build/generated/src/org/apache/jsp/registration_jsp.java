package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=yes\">\n");
      out.write("        <title>Registration</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrapmy.css\">\n");
      out.write("        <script>\n");
      out.write("            var check = function () {\n");
      out.write("                if (document.getElementById('pass').value ==\n");
      out.write("                        document.getElementById('cpass').value) {\n");
      out.write("                    document.getElementById('message').style.color = 'green';\n");
      out.write("                    document.getElementById('message').innerHTML = 'Password Matched.';\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById('message').style.color = 'red';\n");
      out.write("                    document.getElementById('message').innerHTML = 'Password Not matched!';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body style=\"background-color: #660033;\">\n");
      out.write("        <div class=\"container register\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 register-left\">\n");
      out.write("                    <img src=\"css/logo_white.png\" alt=\"\"/>\n");
      out.write("                    <h3>Welcome</h3>\n");
      out.write("                    <p>Register Yourself To enjoy free account!</p>\n");
      out.write("                    <h5 style=\"color: #ffcc99;\">Already Registered?</h5>\n");
      out.write("                    <button onclick=\"location.href = 'login.html';\" class=\"btn btn-primary btn-lg\" name=\"btn_registration\">Sign In</button>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9 register-right\">\n");
      out.write("                    <form action=\"./register\" method=\"post\" role=\"form\">\n");
      out.write("                        <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                            <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                                <h3 class=\"register-heading\">Register Here</h3>\n");
      out.write("\n");
      out.write("                                <div class=\"row register-form\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"fname\" id=\"fname\" class=\"form-control\" placeholder=\"First Name *\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"lname\" id=\"lname\" class=\"form-control\" placeholder=\"Last Name *\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" name=\"pass\" id=\"pass\" class=\"form-control\" placeholder=\"Password *\" onkeyup='check();' />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"password\" name=\"cpass\" id=\"cpass\" class=\"form-control\"  placeholder=\"Confirm Password *\" onkeyup='check();'/>\n");
      out.write("                                            <span id='message'></span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label for=\"pic\">\n");
      out.write("                                                Select Profile Image:\n");
      out.write("                                            </label>\n");
      out.write("                                            <input type=\"file\" name=\"pic\" id=\"pic\" accept=\"image/*\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control\" placeholder=\"Your Email *\"  />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" id=\"mobile\" maxlength=\"10\" name=\"mobile\" class=\"form-control\" placeholder=\"Your Phone *\"  />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"date\" name=\"dob\" id=\"dob\" class=\"form-control\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"col\" id=\"col\" class=\"form-control\" placeholder=\"College Name *\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"maxl\">\n");
      out.write("                                                <label class=\"radio inline\"> \n");
      out.write("                                                    <input type=\"radio\" class=\"form-control\" name=\"gen\" id=\"gen\" value=\"male\" checked>\n");
      out.write("                                                    <span> Male </span> \n");
      out.write("                                                </label>\n");
      out.write("                                                <label class=\"radio inline\"> \n");
      out.write("                                                    <input type=\"radio\" class=\"form-control\" name=\"gen\" id=\"gen\" value=\"female\">\n");
      out.write("                                                    <span>Female </span> \n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-lg\" name=\"btn_registration\">Register</button>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
