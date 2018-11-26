 <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 
 <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top indexOne">
 <div class="container-fluid">
 <button type="button" id="sidebarCollapse" class="btn btn-info">
         <i class="fa fa-bars"></i>
</button>           
 <button class="navbar-toggler ml-auto" type="button" 
         data-toggle="collapse" 
         data-target="#navbarText"
         aria-controls="navbarText"
         aria-expanded="false"
         aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>     
  </button>
  <div class="collapse navbar-collapse" id="navbarText">
   <ul class="navbar-nav ml-auto">
    <li class="nav-item ml-auto">
      <a class="nav-link" href='#'>HOME</a>
    </li>
    <li class="nav-item ml-auto">
      <a class="nav-link" href='<spring:url value="/login"/>'>Logout</a>
      <input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}" />
    </li>
  </ul>
  </div>
  </div>
</nav>   

