<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"> 
</head>
<body>

<sf:form method="post" action="${pageContext.request.contextPath}/docreate" modelAttribute="course">

	<table class="formtable">
		<tr> <td class="label"> Year: </td> <td> <sf:input class="control" type="text" path="year"/> <br/>
			<sf:errors path="year" class="error"/> </td> </tr>
		<tr> <td class="label"> Semester: </td> <td> <sf:input class="control" type="text" path="semester"/> <br/>
			<sf:errors path="semester" class="error"/> </td> </tr>
		<tr> <td class="label"> Code: </td> <td> <sf:textarea class="control" path="code" rows="10" cols="10"/> <br/>
			<sf:errors path="code" class="error"/> </td> </tr>
			<tr> <td class="label"> Name: </td> <td> <sf:input class="control" type="text" path="name"/> <br/>
			<sf:errors path="name" class="error"/> </td> </tr>
			<tr> <td class="label"> Division: </td> <td> <sf:input class="control" type="text" path="division"/> <br/>
			<sf:errors path="division" class="error"/> </td> </tr>
			<tr> <td class="label"> Point: </td> <td> <sf:input class="control" type="text" path="point"/> <br/>
			<sf:errors path="point" class="error"/> </td> </tr>
		<tr> <td class="label">  </td> <td> <input class="control" type="submit" value="수강 신청"/> </td> </tr>	
	</table>

</sf:form>

</body>
</html>