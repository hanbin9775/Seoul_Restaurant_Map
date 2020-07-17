# Seoul_Restaurant_Map

## 1. 설계 배경

공공 데이터 포털(data.go.kr)에서 제공하는 ‘상가(상권)정보_서울’ 데이터를 사용하여 서울특별시의 음식점 현황을 나타내는 웹 어플리케이션을 기획하였다. 대한민국에서 유동 인구 및 거주 인구가 가장 많은 서울특별시의 상가(상권)정보 중 음식점 데이터를 분석한다면 ‘한국인이 선호하는 음식’와 같은 유의미한 상관 관계를 얻을 수 있을 것이라 예상한다. 이 중에 치킨, 커피, 떡볶이는 한국인이 사랑하는 대표적인 음식들인 만큼 다양한 브랜드가 있다. 위 데이터를 활용하여 해당 음식에 대한 브랜드의 개수를 알아내 순위를 매긴다면 어떤 브랜드가 가장 선호되는지 판단할 수 있는 근거가 될 수 있을 것이다. 이러한 결과를 UI/UX를 고려한 사용자 친화적인 화면을 웹 브라우저에서 출력하는 웹 서비스이다.

## 2. 기술 스택

Front-End : HTML, CSS, JavaScript
<br>
Back-End : Spring Framework
<br>
DB : MYSQL v5.7.0

## 3. 요구 사항

IDE : eclipse IDE 
<br>
WEB-SERVER : TOMCAT v8.5 
<br>
DB : MYSQL v5.7.0

## 3. 실행

>	1. mysql> source [파일위치]/createTable.sql
>	2. eclipse> run on server

## 4. 웹 서비스 화면

### 1. 화면 구성

#### 치킨
![screenshot1](C:\Users\user\Desktop\Temp\학교수업\db\DBproject\restaurant_map/screenshot1.jpg)
<br>
<br>
#### 커피
![screenshot1](C:\Users\user\Desktop\Temp\학교수업\db\DBproject\restaurant_map/screenshot2.jpg)
<br>
<br>
#### 떡볶이
![screenshot1](C:\Users\user\Desktop\Temp\학교수업\db\DBproject\restaurant_map/screenshot3.jpg)
<br>
<br>

### 2. 기능

>	1. 음식 카테고리 별 브랜드 인기 순위 10위까지 출력
>	2. 지역구별로 입점해 있는 음식점 개수 출력
>	3. 좌측 하단의 카테고리 버튼을 클릭하면 해당 음식에 대한 정보 조회 가능
>	4. 그래프바 애니메이션
>	5. 페이지 이동없이 Javascript로 페이지 요소 제어

## 5. 데이터 출처

[공공데이터포털](https://www.data.go.kr/)