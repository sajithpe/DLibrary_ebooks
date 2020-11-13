package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userArea_005fsidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"css/userArea_css.css\">\n");
      out.write("<script src = \"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse sidebar\" role=\"navigation\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-sidebar-navbar-collapse-1\">\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">Brand</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"bs-sidebar-navbar-collapse-1\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"#\">Home<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-home\"></span></a></li>\n");
      out.write("\t\t\t\t<li ><a href=\"#\">Profile<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-user\"></span></a></li>\n");
      out.write("\t\t\t\t<li ><a href=\"#\">Messages<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-envelope\"></span></a></li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Settings <span class=\"caret\"></span><span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-cog\"></span></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu forAnimate\" role=\"menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Action</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Another action</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Separated link</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">One more separated link</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Home<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-home\"></span></a></li>\n");
      out.write("\t\t\t\t<li ><a href=\"#\">Profile<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-user\"></span></a></li>\n");
      out.write("\t\t\t\t<li ><a href=\"#\">Messages<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-envelope\"></span></a></li>\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Settings <span class=\"caret\"></span><span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-cog\"></span></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu forAnimate\" role=\"menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Action</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Another action</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Separated link</a></li>\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">One more separated link</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>");
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
