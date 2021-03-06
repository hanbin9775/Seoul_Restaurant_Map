package kr.or.connect.restaurant_map.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.restaurant_map.dao.DDuckDao;
import kr.or.connect.restaurant_map.dto.DDuck;
import kr.or.connect.restaurant_map.service.DDuckService;

@Service
public class DDuckServiceImpl implements DDuckService{
	@Autowired
	DDuckDao dduckDao;
	
	@Override
	@Transactional
	public List<DDuck> getTop10DDuck(Integer start){
		List<DDuck> top3 = dduckDao.selectTop10DDuck(start, DDuckService.LIMIT); 
		return top3;
	}
	public List<DDuck> getGroupByLocDDuck(){
		List<DDuck> groupLoc = dduckDao.selectGroupLocDDuck();
		return groupLoc;
	}
	
}