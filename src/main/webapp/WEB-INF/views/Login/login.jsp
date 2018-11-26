<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
  <link rel="stylesheet" href="<spring:url value="/CustomCss/login.css"/>">
 </head>

 <div class="text-center">
    <c:url var="loginData" value="/login" />
    <form class="form-signin" method="post" action="${loginData }">
     <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="inputEmail" class="sr-only">Email address</label>
      <input type="email" id="inputEmail" name="username" class="form-control" placeholder="Email address" required autofocus>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button> 
      <input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}" />
      <c:if test="${param.error ne null}">
	    <div style="color: red"><h3>Invalid credentials.</h3></div>
       </c:if>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
   </form> 
 </div>
</html> 

