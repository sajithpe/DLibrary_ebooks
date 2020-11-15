package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_005fnavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src = \"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/navigation_js.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("    window.onload = function () {\n");
      out.write("        if (uname == \"noUn\") {\n");
      out.write("            document.getElementById(\"loginbtn\").style.display = \"block\";\n");
      out.write("            document.getElementById(\"user_icon\").title = \"Log In\";\n");
      out.write("\n");
      out.write("        } else {\n");
      out.write("            document.getElementById(\"logoutbtn\").style.display = \"block\";\n");
      out.write("            document.getElementById(\"user_icon\").title = uname;\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\" data-abc=\"true\">\n");
      out.write("        <h1>DLibrary Books</h1>\n");
      out.write("    </a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor02\" \n");
      out.write("            aria-controls=\"navbarColor02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> \n");
      out.write("        <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarColor02\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <ul class=\"navbar-nav ml-auto nav-flex-icons\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\"> \n");
      out.write("                <div class=\"col-xs-5\"> <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\"/></div>\n");
      out.write("                <button class=\"btn btn-secondary \" type=\"submit\">Search</button> \n");
      out.write("            </form>      \n");
      out.write("            <a class=\"nav-link btn\" id=\"navbarDropdownMenuLink-333\" \n");
      out.write("               aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i id=\"user_icon\" class=\"fa fa-user-circle\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"\" onclick=\"user_area();\"></i>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"nav-link btn\" id=\"navbarDropdownMenuLink-333\" \n");
      out.write("               aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                <i id=\"logoutbtn\" class=\"fas fa-sign-out-alt\" style=\"display: none\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Log Out\" onclick=\"log_out()\"></i>\n");
      out.write("                <i id=\"loginbtn\" class=\"fas fa-sign-in-alt\" style=\"display: none\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Log In\" onclick=\"user_area();\"></i>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</nav> \n");
      out.write("\n");
      out.write("\n");
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
