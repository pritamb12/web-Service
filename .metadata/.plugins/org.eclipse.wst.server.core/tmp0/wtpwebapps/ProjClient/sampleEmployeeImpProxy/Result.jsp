<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmployeeImpProxyid" scope="session" class="com.web.service.EmployeeImpProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmployeeImpProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleEmployeeImpProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleEmployeeImpProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.web.service.EmployeeImp getEmployeeImp10mtemp = sampleEmployeeImpProxyid.getEmployeeImp();
if(getEmployeeImp10mtemp == null){
%>
<%=getEmployeeImp10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getEmployeeImp10mtemp != null){
java.lang.String typename15 = getEmployeeImp10mtemp.getName();
        String tempResultname15 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename15));
        %>
        <%= tempResultname15 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 17:
        gotMethod = true;
        java.lang.String getName17mtemp = sampleEmployeeImpProxyid.getName();
if(getName17mtemp == null){
%>
<%=getName17mtemp %>
<%
}else{
        String tempResultreturnp18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getName17mtemp));
        %>
        <%= tempResultreturnp18 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String name_1id=  request.getParameter("name23");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        sampleEmployeeImpProxyid.setName(name_1idTemp);
break;
case 25:
        gotMethod = true;
        int getAge25mtemp = sampleEmployeeImpProxyid.getAge();
        String tempResultreturnp26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getAge25mtemp));
        %>
        <%= tempResultreturnp26 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>