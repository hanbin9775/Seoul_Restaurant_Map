package kr.or.connect.restaurant_map.dao;

public class ChickenDaoSqls {

	public static final String SELECT_TOP3_CHICKEN = "select 상호명 as name, count(상호명) as count from chicken group by 상호명 order by count(상호명) desc limit :start, :limit";
	
	public static final String SELECT_GROUP_BY_lOC = "select count(시군구명) as count, 시군구명 as loc from chicken group by 시군구명 order by count(시군구명) desc";
	
}
