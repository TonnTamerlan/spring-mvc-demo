<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  The student ${ student.lastName } ${ student.firstName } is confirmed!
  <br> Country: ${ student.country }
  <br> Program language: ${ student.programLanguage }
  <br> Operating System:
  <ul>
    <c:forEach var="temp" items="${ student.operatingSystems }">
        <li>${ temp }</li>
    </c:forEach>
  </ul>
</body>
</html>