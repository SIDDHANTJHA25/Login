<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
    <c:when test="${sessionScope.login ==null}">
      <jsp:include page="index.jsp"></jsp:include>
     
    </c:when>
   
    <c:otherwise>
   <jsp:include page="home.jsp"></jsp:include>
    </c:otherwise>
</c:choose>
