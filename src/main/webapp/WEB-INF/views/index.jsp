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
		<button class="circularButton chicken">
			Chicken
		</button>
		<button class="circularButton coffee">
			Coffee
		</button>
		<button class="circularButton dduck">
			DDuck
		</button>
	</div>

	<div class="seoulMap">
		치킨 지수
		<c:forEach items="${groupByLoc }" var="loc">
			<p class="statsItemName">${loc.loc }</p>
			<div class="statsItemBar" style="--w: ${loc.count }px"></div>
		</c:forEach>
	</div>
	<script type="text/javascript" src="${request.contextPath}/restaurant_map/resources/js/index.js"></script>
</body>
</html>
