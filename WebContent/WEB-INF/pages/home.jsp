<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

<h1>Welcome to Spring Mvc</h1>

<f:form action="registerStudent" method="post" modelAttribute="student">


Enter Roll :<f:input path="roll"/> <f:errors path="roll"/><br><br>

Enter Name :<f:input path="name"/> <f:errors path="name"/><br><br>

Enter Marks :<f:input path="marks"/> <f:errors path="marks"/><br><br>

Select Courses :

<f:checkbox path="courses" value="Java"/>Java
<f:checkbox path="courses" value="Angular"/>Angular
<f:checkbox path="courses" value="Spring"/>Spring

<f:errors path="courses"/><br><br>

Select the Terms and Condition : 
<f:checkbox path="terms"/><f:errors path="terms"/>
<br><br>


Select Gender : 
<f:radiobutton path="gender" value="male"/>Male
<f:radiobutton path="gender" value="female"/>Female<f:errors path="gender"/>
<br><br>

Select City : 

<f:select path="city">
<f:option value="">Select</f:option>
<f:option value="Delhi">Delhi</f:option>
<f:option value="Kolkata">Kolkata</f:option>
<f:option value="Mumbai">Mumbai</f:option>
<f:option value="Chennai">Chennai</f:option>

</f:select>

<f:errors path="city"/>


<br><br>


Enter Dob :<f:input path="dob"/><f:errors path="dob"/>
<br><br>
<input type="submit" value="Register">


</f:form>




<%-- <form action="registerStudent" method="post">


Enter Roll :<input type="text" name="roll"/><br><br>

Enter Name :<input type="text" name="name"/><br><br>

Enter Marks :<input type="text" name="marks"/><br><br>

<input type="submit" value="Register">


</form>
 --%>


</body>
</html>