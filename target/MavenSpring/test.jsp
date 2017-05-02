<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.atguigu.spring.web.Person" %><%--
  Created by IntelliJ IDEA.
  User: lance017
  Date: 2017/5/2
  Time: 下午4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);
        Person person = context.getBean(Person.class);
    %>
    <%=person.getName()%>

</body>
</html>
