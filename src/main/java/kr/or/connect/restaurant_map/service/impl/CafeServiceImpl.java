package kr.or.connect.restaurant_map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.restaurant_map.dao.CafeDao;
import kr.or.connect.restaurant_map.dto.Cafe;
import kr.or.connect.restaurant_map.service.CafeService;
import kr.or.connect.restaurant_map.service.ChickenService;

@Service
public class CafeServiceImpl implements CafeService{
	@Autowired
	CafeDao cafeDao;
	
	@Override
	@Transactional
	public List<Cafe> getTop3Cafe(Integer start){
		List<Cafe> ranking = cafeDao.selectTop3(start, CafeService.LIMIT); 
		return ranking;
	}
	public List<Cafe> getGroupByLocCafe(){
		List<Cafe> groupLoc = cafeDao.selectGroupLocCafe();
		return groupLoc;
	}
}