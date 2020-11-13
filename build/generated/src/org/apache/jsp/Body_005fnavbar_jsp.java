package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Body_005fnavbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <br>\n");
      out.write("    <!-- Nav tabs -->\n");
      out.write("    <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\" >\n");
      out.write("        <li class=\"nav-item mr-sm-1 \">\n");
      out.write("            <a class=\"nav-link active btn btn-info mb-1 mr-1\" id=\"home_tab\" data-toggle=\"tab\" href=\"#home1\" \n");
      out.write("               role=\"tab\" aria-controls=\"#home1\" aria-selected=\"true\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item mr-sm-1\">\n");
      out.write("            <a class=\"nav-link btn btn-info mb-1 mr-1\" id=\"books_tab\" data-toggle=\"tab\" href=\"#books1\"\n");
      out.write("               role=\"tab\" aria-controls=\"#books1\" aria-selected=\"false\">Books</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item mr-sm-1\">\n");
      out.write("            <a class=\"nav-link btn btn-info mb-1 mr-1\" id=\"user_tab\" data-toggle=\"tab\" href=\"#userarea1\"\n");
      out.write("               role=\"tab\" aria-controls=\"#userarea1\" aria-selected=\"false\" onclick=\"user_area()\">User Area</a>\n");
      out.write("        </li>\n");
      out.write("\n");
      out.write("        <li class=\"nav-item mr-sm-1\">\n");
      out.write("            <a class=\"nav-link btn btn-warning mb-1 mr-1\" id=\"admin_tab\" data-toggle=\"tab\" href=\"#adminarea1\"\n");
      out.write("               role=\"tab\" aria-controls=\"#adminarea1\" aria-selected=\"false\">Admin Area</a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <!-- Tab panes -->\n");
      out.write("    <div class=\"tab-content\">\n");
      out.write("\n");
      out.write("        <div id=\"home1\" class=\"tab-pane fade show active\" role=\"tabpanel\"aria-labelledby=\"home_tab\"><br>\n");
      out.write("            <div class=\"p-3 my-3 border\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topBookList.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"userarea1\" class=\"tab-pane fade\" role=\"tabpanel\"aria-labelledby=\"user_tab\"><br> \n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"ulog_div\" class=\"p-3 my-3 border\" style=\"display: none\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"ureg_div\" class=\"p-3 my-3 border\" style=\"display: none\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"udetail_div\" class=\"p-3 my-3 border\" style=\"display: none\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"books1\" class=\"tab-pane fade\" role=\"tabpanel\"aria-labelledby=\"books_tab\"><br> \n");
      out.write("\n");
      out.write("            <div class=\"p-3 my-3 border\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "booksPage.jsp", out, false);
      out.write("\n");
      out.write("            </div>  \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"adminarea1\" class=\"tab-pane fade\" role=\"tabpanel\"aria-labelledby=\"admin_tab\"><br> \n");
      out.write("\n");
      out.write("           <div class=\"p-3 my-3 border\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "booksPage.jsp", out, false);
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
