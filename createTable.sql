CREATE table shops (
	`상가업소번호` int(20) default null,
    `상호명` varchar(60) default null,
    `지점명` varchar(60) default null,
    `상권업종대분류명` varchar(60) default null,
    `상권업종중분류명` varchar(60) default null, 
    `상권업종소분류명` varchar(60) default null,
    `시군구명` varchar(60) default null
) charset=euckr;

 load data infile "C:/ProgramData/MySQL/MySQL Server 5.7/Uploads/seoulshopdb.csv"
    into table shops
    character set euckr
    fields terminated by ','
    enclosed by '"'
    lines terminated by '\n'
    ignore 1 rows;
    
CREATE table restaurant
AS
(
		SELECT *
		FROM shops
        where `상권업종대분류명`='음식'
);

CREATE table chicken
AS
(
		SELECT `상가업소번호`, `상호명`, `지점명`, `시군구명`
		FROM restaurant
        where `상권업종소분류명`='후라이드/양념치킨'
);

CREATE table cafe
AS
(
		SELECT `상가업소번호`, `상호명`, `지점명`, `시군구명`
		FROM restaurant
        where `상권업소소분류명`='커피전문점/카페/다방'
);

CREATE table dduckbokki
AS
(
		SELECT `상가업소번호`, `상호명`, `지점명`, `시군구명`
		FROM restaurant
        where `상권업종소분류명`='떡볶이전문'
);