/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.11
 * Generated at: 2023-01-21 18:39:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.jsp2.tagfiles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class panel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tags/panel.tag", Long.valueOf(1534017014000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>JSP 2.0 Examples - Panels using Tag Files</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <h1>JSP 2.0 Examples - Panels using Tag Files</h1>\n");
      out.write("    <hr>\n");
      out.write("    <p>This JSP page invokes a custom tag that draws a\n");
      out.write("    panel around the contents of the tag body.  Normally, such a tag\n");
      out.write("    implementation would require a Java class with many println() statements,\n");
      out.write("    outputting HTML.  Instead, we can use a .tag file as a template,\n");
      out.write("    and we don't need to write a single line of Java or even a TLD!</p>\n");
      out.write("    <hr>\n");
      out.write("    <table border=\"0\">\n");
      out.write("      <tr valign=\"top\">\n");
      out.write("        <td>\n");
      out.write("          ");
      if (_jspx_meth_tags_005fpanel_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("          ");
      if (_jspx_meth_tags_005fpanel_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </td>\n");
      out.write("        <td>\n");
      out.write("          ");
      if (_jspx_meth_tags_005fpanel_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tags_005fpanel_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:panel
    org.apache.jsp.tag.web.panel_tag _jspx_th_tags_005fpanel_005f0 = new org.apache.jsp.tag.web.panel_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tags_005fpanel_005f0);
    try {
      _jspx_th_tags_005fpanel_005f0.setJspContext(_jspx_page_context);
      // /jsp/jsp2/tagfiles/panel.jsp(34,10) name = color type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f0.setColor("#ff8080");
      // /jsp/jsp2/tagfiles/panel.jsp(34,10) name = bgcolor type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f0.setBgcolor("#ffc0c0");
      // /jsp/jsp2/tagfiles/panel.jsp(34,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f0.setTitle("Panel 1");
      _jspx_th_tags_005fpanel_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_tags_005fpanel_005f0, null));
      _jspx_th_tags_005fpanel_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tags_005fpanel_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tags_005fpanel_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:panel
    org.apache.jsp.tag.web.panel_tag _jspx_th_tags_005fpanel_005f1 = new org.apache.jsp.tag.web.panel_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tags_005fpanel_005f1);
    try {
      _jspx_th_tags_005fpanel_005f1.setJspContext(_jspx_page_context);
      // /jsp/jsp2/tagfiles/panel.jsp(39,10) name = color type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f1.setColor("#80ff80");
      // /jsp/jsp2/tagfiles/panel.jsp(39,10) name = bgcolor type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f1.setBgcolor("#c0ffc0");
      // /jsp/jsp2/tagfiles/panel.jsp(39,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f1.setTitle("Panel 2");
      _jspx_th_tags_005fpanel_005f1.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_tags_005fpanel_005f1, null));
      _jspx_th_tags_005fpanel_005f1.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tags_005fpanel_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_tags_005fpanel_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:panel
    org.apache.jsp.tag.web.panel_tag _jspx_th_tags_005fpanel_005f2 = new org.apache.jsp.tag.web.panel_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tags_005fpanel_005f2);
    try {
      _jspx_th_tags_005fpanel_005f2.setJspContext(_jspx_page_context);
      // /jsp/jsp2/tagfiles/panel.jsp(47,10) name = color type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f2.setColor("#8080ff");
      // /jsp/jsp2/tagfiles/panel.jsp(47,10) name = bgcolor type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f2.setBgcolor("#c0c0ff");
      // /jsp/jsp2/tagfiles/panel.jsp(47,10) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f2.setTitle("Panel 3");
      _jspx_th_tags_005fpanel_005f2.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_tags_005fpanel_005f2, null));
      _jspx_th_tags_005fpanel_005f2.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tags_005fpanel_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_tags_005fpanel_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:panel
    org.apache.jsp.tag.web.panel_tag _jspx_th_tags_005fpanel_005f3 = new org.apache.jsp.tag.web.panel_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tags_005fpanel_005f3);
    try {
      _jspx_th_tags_005fpanel_005f3.setJspContext(_jspx_page_context);
      _jspx_th_tags_005fpanel_005f3.setParent(_jspx_parent);
      // /jsp/jsp2/tagfiles/panel.jsp(49,12) name = color type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f3.setColor("#ff80ff");
      // /jsp/jsp2/tagfiles/panel.jsp(49,12) name = bgcolor type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f3.setBgcolor("#ffc0ff");
      // /jsp/jsp2/tagfiles/panel.jsp(49,12) name = title type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tags_005fpanel_005f3.setTitle("Inner");
      _jspx_th_tags_005fpanel_005f3.setJspBody(new Helper( 3, _jspx_page_context, _jspx_th_tags_005fpanel_005f3, null));
      _jspx_th_tags_005fpanel_005f3.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tags_005fpanel_005f3);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("            First panel.<br/>\n");
      out.write("          ");
      return false;
    }
    public boolean invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("            Second panel.<br/>\n");
      out.write("            Second panel.<br/>\n");
      out.write("            Second panel.<br/>\n");
      out.write("            Second panel.<br/>\n");
      out.write("          ");
      return false;
    }
    public boolean invoke2( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("            Third panel.<br/>\n");
      out.write("            ");
      if (_jspx_meth_tags_005fpanel_005f3(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("            Third panel.<br/>\n");
      out.write("          ");
      return false;
    }
    public boolean invoke3( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("              A panel in a panel.\n");
      out.write("            ");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}