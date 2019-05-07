package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ManagerAddNew_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add New</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Add New</h1>\n");
      out.write("        <div style =\"width: 900px; margin-left: auto ;margin-right: auto \">\n");
      out.write("            <form action=\"JSP/ManagerAddNew.jsp\" method=\"post\">\n");
      out.write("                Title:<br>\n");
      out.write("                <input type=\"text\" name=\"title\" style=\"width:200px\"><br>\n");
      out.write("                Description:<br>\n");
      out.write("                <input type=\"text\" name=\"description\" style=\"width: 200px\"><br>\n");
      out.write("                Detail:<br>\n");
      out.write("                <textarea name=\"detail\" style=\"width: 400px ; height: 200px\"></textarea><br>\n");
      out.write("                Category:\n");
      out.write("                <select name=\"category\">\n");
      out.write("                    <option value=\"world\">World</option>\n");
      out.write("                    <option value=\"Tech\">Tech</option>\n");
      out.write("                    <option value=\"Sport\">Sport</option>\n");
      out.write("                </select><br>\n");
      out.write("                Image:<br>\n");
      out.write("                <input type=\"text\" name=\"image\" style=\"width: 200px\"><br>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
