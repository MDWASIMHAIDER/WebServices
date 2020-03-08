<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<h1 style="text-align: center">Apply For Passport Registration</h1>
<table>
	<form:form action="pregister.htm" method="POST" modelAttribute="pcmd">
		<tr>
			<th>Birth Id</th>
			<th><form:input path="birthId" /></th>
		</tr>
		<tr>
			<td>Phone</td>
			<td><form:input path="phone" /></td>
		</tr>
			<tr>
			<td>Address</td>
			<td><form:input path="pholderAddress" /></td>
		</tr>
		<tr>
			<th>Applicant Name</th>
			<th><form:input path="pholderName" /></th>
		</tr>
		<tr>
			<td>Father Name</td>
			<td><form:input path="fatherName" /></td>
		</tr>
		
	
		<tr>
			<td>Maritial Status</td>
			<td><form:input path="maritialStatus" /></td>
		</tr>
		<tr>
			<td>Criminal Record</td>
			<td><form:input path="criminalRecord" /></td>
		</tr>
		<tr>
			<td>Profession</td>
			<td><form:input path="profession" /></td>
		</tr>
		 <tr>
      		<td><input type="submit"  value="Insert"/></td>
      		<!-- <td><input type="reset" vlaue="resest"/></td> -->
   		</tr>
	</form:form>
</table>
${res}

