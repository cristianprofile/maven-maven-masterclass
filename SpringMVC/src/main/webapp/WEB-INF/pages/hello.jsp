<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h1>Total de bases</h1>
	<c:forEach var="base" items="${findAllBases}">
		<c:out value="${base.name}"></br></c:out>
	</c:forEach>
</body>
</html>