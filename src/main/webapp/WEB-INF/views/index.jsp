<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${request.contextPath}/restaurant_map/resources/css/style.css">
<title>Restaurant-Map</title>
<body>

	<div class="rankingBox">
		<div class="rankingTitle">Top 3 Chicken!
			<c:forEach items="${top3 }" var="chicken">
				<div class="rankingContent">
					${chicken.name } : ${chicken.count }
				</div>
			</c:forEach>
		</div>
	</div>

	<div class="categories">
		There will be categories here
	</div>

	<div class="seoulMap">
		There will be Seoul Map here
		<c:forEach items="${groupByLoc }" var="loc">
		<div>
			${loc.loc } : ${loc.count }
		</div>
	</c:forEach>
	</div>

</body>
</html>
