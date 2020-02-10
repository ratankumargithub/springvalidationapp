<%@page import="java.util.Arrays"%>
<%@page import="com.ratan.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">


 <% StudentBean s= (StudentBean)request.getAttribute("student"); 
 
 String ar[]=s.getCourses();
 String c=Arrays.toString(ar);
 %>

<h2>Roll is <%=s.getName() %></h2>
<h2>Name is <%=s.getRoll() %></h2>
<h2>Marks is <%=s.getMarks() %></h2>
<h2>Courses are <%=c %></h2>
<h2>Gender is <%=s.getGender() %></h2>
<h2>Terms is <%=s.isTerms() %></h2>



<%-- <h2>Roll is ${student.roll }</h2>
<h2>Name is ${student.name }</h2>
<h2>Marks is ${student.marks }</h2>

<h2>Courses Are ${student.courses[0] }</h2>
 --%>

</body>
</html>