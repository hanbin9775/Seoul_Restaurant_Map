package kr.or.connect.restaurant_map.service;

import java.util.List;

import kr.or.connect.restaurant_map.dto.Cafe;

public interface CafeService {
	public static final Integer LIMIT = 10; 
	public List<Cafe> getTop3Cafe(Integer start);
	public List<Cafe> getGroupByLocCafe();
}
