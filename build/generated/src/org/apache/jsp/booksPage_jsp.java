package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class booksPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script src = \"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container p-3 my-3 border\">\n");
      out.write("  <h3 class=\"mb-3\">Our large collection of Ebooks</h3>\n");
      out.write("  <div class=\"container p-3 my-3 border\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <p class=\"mb-1\">Filters:</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"row mb-3\">\n");
      out.write("    <div class=\"col\">\n");
      out.write("      <div class=\"btn-group btn-group-toggle\" data-toggle=\"buttons\">\n");
      out.write("        <label class=\"btn btn-outline-primary active\">\n");
      out.write("          <input type=\"radio\" name=\"shuffle-filter\" value=\"all\" checked=\"checked\"/>All\n");
      out.write("        </label>\n");
      out.write("        <label class=\"btn btn-outline-primary\">\n");
      out.write("          <input type=\"radio\" name=\"shuffle-filter\" value=\"nature\"/>Nature\n");
      out.write("        </label>\n");
      out.write("        <label class=\"btn btn-outline-primary\">\n");
      out.write("          <input type=\"radio\" name=\"shuffle-filter\" value=\"fruit\"/>Fruit\n");
      out.write("        </label>\n");
      out.write("        <label class=\"btn btn-outline-primary\">\n");
      out.write("          <input type=\"radio\" name=\"shuffle-filter\" value=\"architecture\"/>Architecture\n");
      out.write("        </label>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"container p-3 my-3 border\">\n");
      out.write("  <div class=\"row g-2\">\n");
      out.write("        ");


            int x = 0;
            String tit = "";
            String auth = "";
            String cat = "";

            while (x < 10) {
                tit = "Title" + x;
                auth = "Author" + x;
                cat = "Category" + x;

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-11 col-md-4 col-lg-2\">\n");
      out.write("            <div class=\"card mb-2\">\n");
      out.write("                <img class=\"card-img-top\" src=\"https://dummyimage.com/600x400/55595c/fff\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h4 class=\"card-title\"><a href=\"product.html\" title=\"View Product\">");
 out.println(tit); 
      out.write("</a></h4>\n");
      out.write("                    <p class=\"card-text\">");
 out.println(auth); 
      out.write("</p>\n");
      out.write("                    <p class=\"card-text\">");
 out.println(cat); 
      out.write("</p>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <h3 class=\"btn btn-danger btn-block\">Download</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <h3 href=\"#\" class=\"btn btn-primary btn-block\">Read later</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><br>\n");
      out.write("\n");
      out.write("        ");


                x++;

            }


        
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>");
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
