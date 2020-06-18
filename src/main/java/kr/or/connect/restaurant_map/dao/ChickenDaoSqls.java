package kr.or.connect.restaurant_map.dao;

public class ChickenDaoSqls {

	public static final String SELECT_TOP3_CHICKEN = "select 상호명 as name, count(상호명) as count from chicken group by 상호명 order by count(상호명) desc limit :start, :limit";
	
}
