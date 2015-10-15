<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix = "form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<form:form method = "POST" commandName="user">
     <table>
         <tr>
              <td>User Name:</td>
              <td><form:input path="userName"/></td>
              <td><form:errors path="userName" cssStyle="color:#ff0000"></form:errors>
         </tr>
         <tr>
             <td>Password:</td>
             <td><form:input type="password" path="password"/></td>
             <td><form:errors path="password" cssStyle="color:#ff0000"/></td>
         </tr>
         <tr/><tr/>
         <tr>
             <td><input type="checkbox" name="remember"> Remember me for 1 week </td>
         </tr>
         <tr/><tr/><tr/><tr/>
         <tr>
             <td><input type = "submit" name="submit" value="Member Login"/></td>
         </tr>
         
     </table>
</form:form>


</body>
</html>
