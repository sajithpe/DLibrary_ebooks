package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<script src=\"js/navigation_js.js\"></script>\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("    function my_profile() {\n");
      out.write("\n");
      out.write("    var s_id = window.uname;\n");
      out.write("\n");
      out.write("    var xmlHttp = getXmlHttpRequest();\n");
      out.write("\n");
      out.write("    if (xmlHttp != null) {\n");
      out.write("        xmlHttp.onreadystatechange = function () {\n");
      out.write("            if (xmlHttp.readyState == 1 || xmlHttp.readyState == 2 || xmlHttp.readyState == 3) {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            if (xmlHttp.readyState == 4) {\n");
      out.write("                var res = xmlHttp.responseText;\n");
      out.write("                if (res == 0) {\n");
      out.write("\n");
      out.write("\n");
      out.write("                    document.getElementById(\"myprotext\").innerHTML = \"No User details\";\n");
      out.write("                } else {\n");
      out.write("\n");
      out.write("                    document.getElementById(\"myprodata\").innerHTML = res;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        xmlHttp.open(\"POST\", \"User_search.java\", true);\n");
      out.write("        xmlHttp.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("        xmlHttp.send(\"search_id=\" + s_id);\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Page Content -->\n");
      out.write("<div class=\"container\" id=\"myprodata\">\n");
      out.write("    <h3 id=\"myprotext\">My Profile</h3>\n");
      out.write("    <button class=\"btn btn-danger\" onclick=\"my_profile()\">click me</button>\n");
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
