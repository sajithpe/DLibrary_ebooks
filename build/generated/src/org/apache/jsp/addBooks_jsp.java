package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBooks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src = \"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/navigation_js.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Disable form submissions if there are invalid fields\n");
      out.write("    (function () {\n");
      out.write("        'use strict';\n");
      out.write("        window.addEventListener('load', function () {\n");
      out.write("            // Get the forms we want to add validation styles to\n");
      out.write("            var forms = document.getElementsByClassName('needs-validation');\n");
      out.write("            // Loop over them and prevent submission\n");
      out.write("            var validation = Array.prototype.filter.call(forms, function (form) {\n");
      out.write("                form.addEventListener('submit', function (event) {\n");
      out.write("                    if (form.checkValidity() === false) {\n");
      out.write("                        event.preventDefault();\n");
      out.write("                        event.stopPropagation();\n");
      out.write("                    }\n");
      out.write("                    form.classList.add('was-validated');\n");
      out.write("                }, false);\n");
      out.write("            });\n");
      out.write("        }, false);\n");
      out.write("    })();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2>Add Books</h2>\n");
      out.write("\n");
      out.write("    <form action=\"/action_page.php\" class=\"needs-validation\" novalidate>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"bk_name\">Book Name:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"bk_name\" name=\"bkname\" required>\n");
      out.write("            <div class=\"valid-feedback\">Valid.</div>\n");
      out.write("            <div class=\"invalid-feedback\">Please fill out this field.</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"bk_auth\">Author:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"bk_auth\" name=\"bkauth\" required>\n");
      out.write("            <div class=\"valid-feedback\">Valid.</div>\n");
      out.write("            <div class=\"invalid-feedback\">Please fill out this field.</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"bk_auth\">Author:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"bk_auth\" name=\"bkauth\" required>\n");
      out.write("            <div class=\"valid-feedback\">Valid.</div>\n");
      out.write("            <div class=\"invalid-feedback\">Please fill out this field.</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"pwd\">Password:</label>\n");
      out.write("            <input type=\"password\" class=\"form-control\" id=\"pwd\" placeholder=\"Enter password\" name=\"pswd\" required>\n");
      out.write("            <div class=\"valid-feedback\">Valid.</div>\n");
      out.write("            <div class=\"invalid-feedback\">Please fill out this field.</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group form-check\">\n");
      out.write("            <label class=\"form-check-label\">\n");
      out.write("                <input class=\"form-check-input\" type=\"checkbox\" name=\"remember\" required> I agree on blabla.\n");
      out.write("                <div class=\"valid-feedback\">Valid.</div>\n");
      out.write("                <div class=\"invalid-feedback\">Check this checkbox to continue.</div>\n");
      out.write("            </label>\n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
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
