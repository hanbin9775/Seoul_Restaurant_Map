package kr.or.connect.restaurant_map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.restaurant_map.dao.ChickenDao;
import kr.or.connect.restaurant_map.dto.Chicken;
import kr.or.connect.restaurant_map.service.ChickenService;

@Service
public class ChickenServiceImpl implements ChickenService{
	@Autowired
	ChickenDao chickenDao;
	
	@Override
	@Transactional
	public List<Chicken> getTop10Chicken(Integer start){
		List<Chicken> top3 = chickenDao.selectTop10(start, ChickenService.LIMIT); 
		return top3;
	}
	public List<Chicken> getGroupByLocChicken(){
		List<Chicken> groupLoc = chickenDao.selectGroupLocChicken();
		return groupLoc;
	}
	
}