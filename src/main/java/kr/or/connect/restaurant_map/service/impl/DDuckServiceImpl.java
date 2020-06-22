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
	DDuckDao DDuckDao;
	
	@Override
	@Transactional
	public List<DDuck> getTop3DDuck(Integer start){
		List<DDuck> top3 = DDuckDao.selectTop3DDuck(start, DDuckService.LIMIT); 
		return top3;
	}
	public List<DDuck> getGroupByLocDDuck(){
		List<DDuck> groupLoc = DDuckDao.selectGroupLocDDuck();
		return groupLoc;
	}
	
}