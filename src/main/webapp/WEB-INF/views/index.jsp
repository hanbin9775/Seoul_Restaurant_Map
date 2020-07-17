<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${request.contextPath}/restaurant_map/resources/css/style.css">
<title>Restaurant-Map</title>
<body>

	<!-- 브랜드 랭킹 그래프 -->
	<div class="rankingBox">
		<div class="rankingDescription">서울시내 가장 많이 입점해 있는 브랜드</div>
		<div class="rankingTitle">Top 10
			<c:forEach items="${chicken_ranking }" var="item">
				<p class = "statsItemName">${item.name }</p>
				<div class ="statsItemBar" style="--w: ${item.count * 2.5}px">
					<div class ="statsItemCnt">${item.count }</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<div class="rankingBox unselected">
		<div class="rankingDescription">서울시내 가장 많이 입점해 있는 브랜드</div>
		<div class="rankingTitle">Top 10
			<c:forEach items="${cafe_ranking }" var="item">
				<p class = "statsItemName">${item.name }</p>
				<div class ="statsItemBar" style="--w: ${item.count / 3}px">
					<div class ="statsItemCnt">${item.count }</div>
				</div>
			</c:forEach>
		</div>
	</div>
	<div class="rankingBox unselected">
		<div class="rankingDescription">서울시내 가장 많이 입점해 있는 브랜드</div>
		<div class="rankingTitle">Top 10
			<c:forEach items="${dduck_ranking }" var="item">
				<p class = "statsItemName">${item.name }</p>
				<div class ="statsItemBar" style="--w: ${item.count * 6}px">
					<div class ="statsItemCnt">${item.count }</div>
				</div>
			</c:forEach>
		</div>
	</div>
	

	<div class="categories">
		<button class="circularButton chickenBtn">
			Chicken
		</button>
		<button class="circularButton cafeBtn">
			Cafe
		</button>
		<button class="circularButton dduckBtn">
			DDuck
		</button>
	</div>

	<!--지수 그래프 -->
	<div class="seoulMap ">
		<div class="rankingDescription">지역구별로 입점해 있는 브랜드 개수</div>
		치킨 지수
		<c:forEach items="${groupByLocChicken }" var="loc">
			<p class="statsItemName">${loc.loc }</p>
			<div class ="statsItemBar" style="--w: ${loc.count * 2}px">
				<div class ="statsItemCnt">${loc.count }</div>
			</div>
		</c:forEach>
	</div>
	<div class="seoulMap unselected">
		<div class="rankingDescription">지역구별로 입점해 있는 브랜드 개수</div>
		카페 지수
		<c:forEach items="${groupByLocCafe }" var="loc">
			<p class="statsItemName">${loc.loc }</p>
			<div class ="statsItemBar" style="--w: ${loc.count / 3}px">
				<div class ="statsItemCnt">${loc.count }</div>
			</div>
		</c:forEach>
	</div>
	<div class="seoulMap unselected">
		<div class="rankingDescription">지역구별로 입점해 있는 브랜드 개수</div>
		떡볶이 지수
		<c:forEach items="${groupByLocDDuck }" var="loc">
			<p class="statsItemName">${loc.loc }</p>
			<div class ="statsItemBar" style="--w: ${loc.count * 6}px">
				<div class ="statsItemCnt">${loc.count }</div>
			</div>
		</c:forEach>
	</div>
	<script type="text/javascript" src="${request.contextPath}/restaurant_map/resources/js/index.js"></script>
</body>
</html>
