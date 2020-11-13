package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userArea_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src = \"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/navigation_js.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(() => {\n");
      out.write("  // SideNav Button Initialization\n");
      out.write("  $(\".button-collapse\").sideNav2();\n");
      out.write("  // SideNav Scrollbar Initialization\n");
      out.write("  var sideNavScrollbar = document.querySelector('.custom-scrollbar');\n");
      out.write("  var ps = new PerfectScrollbar(sideNavScrollbar);\n");
      out.write("});\n");
      out.write("</script>    \n");
      out.write("<style>\n");
      out.write("    body, html {\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write(".bg {\n");
      out.write("  /* The image used */\n");
      out.write("  background-image: url(\"https://mdbootstrap.com/img/Photos/Horizontal/Nature/full page/img(20).jpg\");\n");
      out.write("\n");
      out.write("  /* Full height */\n");
      out.write("  height: 100%;\n");
      out.write("\n");
      out.write("  /* Center and scale the image nicely */\n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <body>\n");
      out.write("  <div class=\"bg\">\n");
      out.write("    <!-- SideNav slide-out button -->\n");
      out.write("    <a href=\"#\" data-activates=\"slide-out\" class=\"btn btn-dark p-3 button-collapse\"><i\n");
      out.write("    class=\"fas fa-bars\"></i></a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Sidebar navigation -->\n");
      out.write("<div id=\"slide-out\" class=\"side-nav2 side stylish-color\">\n");
      out.write("  <ul class=\"custom-scrollbar\">\n");
      out.write("    <!-- Logo -->\n");
      out.write("    <li>\n");
      out.write("      <div class=\"logo-wrapper waves-light\">\n");
      out.write("        <a href=\"#\"><img src=\"https://mdbootstrap.com/img/logo/mdb-transparent.png\"\n");
      out.write("            class=\"img-fluid flex-center\"></a>\n");
      out.write("      </div>\n");
      out.write("    </li>\n");
      out.write("    <!--/. Logo -->\n");
      out.write("    <!--Social-->\n");
      out.write("    <li>\n");
      out.write("      <ul class=\"social\">\n");
      out.write("        <li><a href=\"#\" class=\"icons-sm fb-ic\"><i class=\"fab fa-facebook-f\"> </i></a></li>\n");
      out.write("        <li><a href=\"#\" class=\"icons-sm pin-ic\"><i class=\"fab fa-pinterest\"> </i></a></li>\n");
      out.write("        <li><a href=\"#\" class=\"icons-sm gplus-ic\"><i class=\"fab fa-google-plus-g\"> </i></a></li>\n");
      out.write("        <li><a href=\"#\" class=\"icons-sm tw-ic\"><i class=\"fab fa-twitter\"> </i></a></li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <!--/Social-->\n");
      out.write("    <!--Search Form-->\n");
      out.write("    <li>\n");
      out.write("      <form class=\"search-form\" role=\"search\">\n");
      out.write("        <div class=\"form-group md-form mt-0 pt-1 waves-light\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </li>\n");
      out.write("    <!--/.Search Form-->\n");
      out.write("    <!-- Side navigation links -->\n");
      out.write("    <li>\n");
      out.write("      <ul class=\"collapsible collapsible-accordion\">\n");
      out.write("        <li><a class=\"collapsible-header waves-effect arrow-r active\"><i class=\"fas fa-chevron-right\"></i> Submit\n");
      out.write("            blog<i class=\"fas fa-angle-down rotate-icon\"></i></a>\n");
      out.write("          <div class=\"collapsible-body\">\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">Submit listing</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">Registration form</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"far fa-hand-pointer\"></i>\n");
      out.write("            Instruction<i class=\"fas fa-angle-down rotate-icon\"></i></a>\n");
      out.write("          <div class=\"collapsible-body\">\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">For bloggers</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">For authors</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"fas fa-eye\"></i> About<i\n");
      out.write("              class=\"fas fa-angle-down rotate-icon\"></i></a>\n");
      out.write("          <div class=\"collapsible-body\">\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">Introduction</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">Monthly meetings</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li><a class=\"collapsible-header waves-effect arrow-r\"><i class=\"far fa-envelope\"></i> Contact me<i\n");
      out.write("              class=\"fas fa-angle-down rotate-icon\"></i></a>\n");
      out.write("          <div class=\"collapsible-body\">\n");
      out.write("            <ul>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">FAQ</a>\n");
      out.write("              </li>\n");
      out.write("              <li><a href=\"#\" class=\"waves-effect\">Write a message</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </li>\n");
      out.write("    <!--/. Side navigation links -->\n");
      out.write("  </ul>\n");
      out.write("  <div class=\"sidenav-bg\"></div>\n");
      out.write("</div>\n");
      out.write("<!--/. Sidebar navigation -->\n");
      out.write("</body>\n");
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
