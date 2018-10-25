<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student registration form</title>
</head>
<body>

  <form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    
    Country: 
    <form:select path="country">
      <form:options items="${student.countryOptions}" />
    </form:select>
    <br><br>
    
    Program language:
    <form:radiobutton path="programLanguage" value="JAVA" label="JAVA"/>
    <form:radiobutton path="programLanguage" value="C#" label="C#"/>
    <form:radiobutton path="programLanguage" value="C++" label="C++"/>
    <form:radiobutton path="programLanguage" value="JS" label="JavaScript"/>
    <br><br>
    
    Operating Systems:
    <form:checkbox path="operatingSystems" value="Windows" label="Windows"/>
    <form:checkbox path="operatingSystems" value="Linux" label="Linux"/>
    <form:checkbox path="operatingSystems" value="OS/2" label="OS/2"/>
    
    <br><br>
    
    <input type="submit" value="Submit" />
  </form:form>

</body>
</html>