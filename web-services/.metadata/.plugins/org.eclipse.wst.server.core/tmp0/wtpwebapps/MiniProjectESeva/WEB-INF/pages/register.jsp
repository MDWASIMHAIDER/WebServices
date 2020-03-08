<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1>Register</h1>
<h1 style="color:green;text-align:center">Insert Child Details</h1><br>
<table>
 	<form:form action="register.htm" method="POST" modelAttribute="ecmd">
 		<tr>
      		<td> Child Name:: </td>
      		<td> <form:input path="Name"/> </td>
  		 </tr>
  		 <tr>
  		 	<td>Parent ph::</td>
  		 	<td><form:input path="phone"/></td>
  		 </tr>
  		 <tr>
  		 	<td>Father Name::</td>
  		 	<td><form:input path="fatherName"/></td>
  		 </tr>
  		 <tr>
  		 	<td>Mother Name::</td>
  		 	<td><form:input path="motherName"/></td>
  		 </tr>
  		 <tr>
  		 	<td>Gender</td>
  		 	<td><form:input path="gender"/></td>
  		 </tr>
  		  <tr>
  		 	<td>Religion</td>
  		 	<td><form:input path="religion"/></td>
  		 </tr>
  		 
  		  <tr>
  		 	<td>Address</td>
  		 	<td><form:input path="address"/></td>
  		 </tr>
  		  <tr>
  		 	<td>Date of birth</td>
  		 	<td><form:input path="dob"/></td>
  		 </tr>
  		 
  		 <tr>
      		<td><input type="submit"  value="Insert"/></td>
      		<td><input type="reset" vlaue="resest"/></td>
   		</tr>
 	</form:form>
 		
</table>

${res}