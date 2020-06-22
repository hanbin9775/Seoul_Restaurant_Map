package kr.or.connect.restaurant_map.dao;

public class RestaurantDaoSqls {

	//select top 3
	public static final String SELECT_TOP3_CHICKEN = "select 상호명 as name, count(상호명) as count from chicken group by 상호명 order by count(상호명) desc limit :start, :limit";
	public static final String SELECT_TOP3_CAFE = "select 상호명 as name, count(상호명) as count from cafe group by 상호명 order by count(상호명) desc limit :start, :limit";
	public static final String SELECT_TOP3_DDUCK = "select 상호명 as name, count(상호명) as count from dduckbokki group by 상호명 order by count(상호명) desc limit :start, :limit";
	
	//GROUP By Loc
	public static final String CHICKEN_GROUP_BY_lOC = "select count(시군구명) as count, 시군구명 as loc from chicken group by 시군구명 order by count(시군구명) desc";
	public static final String CAFE_GROUP_BY_lOC = "select count(시군구명) as count, 시군구명 as loc from cafe group by 시군구명 order by count(시군구명) desc";
	public static final String DDUCK_GROUP_BY_lOC = "select count(시군구명) as count, 시군구명 as loc from dduckbokki group by 시군구명 order by count(시군구명) desc";
}
