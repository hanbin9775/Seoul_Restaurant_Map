package kr.or.connect.restaurant_map.service;

import java.util.List;

import kr.or.connect.restaurant_map.dto.Chicken;

public interface ChickenService {
	
	public static final Integer LIMIT = 3; 
	public List<Chicken> getTop3Chicken(Integer start);
}
