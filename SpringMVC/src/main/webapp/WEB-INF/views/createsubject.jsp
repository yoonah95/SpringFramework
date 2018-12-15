<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib  uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
</head>
<body>

<sf:form method="post" action="${pageContext.request.contextPath}/docreate" modelAttribute="subject">
<table class="formtable">


<tr> <td class="label"> Name: </td> <td><Input class="control" type="text" name="name"/><br/>
<errors path="name" class"error"/></td> </tr>
<tr> <td class="label"></td> <td><Input class="control" type="submit" value="신청"/></td> </tr>

</table>
</sf:form>
</body>
</html>