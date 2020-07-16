package kr.or.connect.restaurant_map.service;

import java.util.List;

import kr.or.connect.restaurant_map.dto.DDuck;

public interface DDuckService {
	public static final Integer LIMIT = 10; 
	public List<DDuck> getTop3DDuck(Integer start);
	public List<DDuck> getGroupByLocDDuck();
}
