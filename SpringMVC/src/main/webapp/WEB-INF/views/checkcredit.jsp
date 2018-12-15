<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
         <table style="width:100%">
     <tr>
       <th>년도</th>
       <th>학기</th> 
       <th>이수 학점</th>
       <th>상세보기</th>
     </tr>
     <tr>
       <td>2015</td>
       <td>1</td>
       <td>${credit1}</td>
       <td>
       <a href="${pageContext.request.contextPath }/checksubjects?param=1">링크</a>
       </td>
     </tr>
     <tr>
       <td>2015</td>
       <td>2</td>
       <td>${credit2}</td>
       <td>
       <a href="${pageContext.request.contextPath }/checksubjects?param=2">링크</a>
       </td>
     </tr>
     <tr>
       <td>2016</td>
       <td>1</td>
       <td>${credit3}</td>
       <td>
        <a href="${pageContext.request.contextPath }/checksubjects?param=3">링크</a>
       </td>
     </tr>
     <tr>
       <td>2016</td>
       <td>2</td>
       <td>${credit4}</td>
       <td>
        <a href="${pageContext.request.contextPath }/checksubjects?param=4">링크</a>
       </td>
     </tr>
     <tr>
       <td>2018</td>
       <td>1</td>
       <td>${credit5}</td>
       <td>
        <a href="${pageContext.request.contextPath }/checksubjects?param=5">링크</a>
       </td>
     </tr>
     <tr>
       <td>2018</td>
       <td>2</td>
       <td>${credit6}</td>
       <td>
       <a href="${pageContext.request.contextPath }/checksubjects?param=6">링크</a>
       </td>
     </tr>
   
   </table>
</body>
</html>